# Fase 4 — Spring Boot

Esta fase pega as três camadas da Fase 3 e deixa o Spring Boot cuidar da criação e da ligação dos objetos.

## Exercício 4.1 — Anotações

- `@SpringBootApplication`: marca a aplicação principal e faz o Spring procurar os componentes nos pacotes abaixo dela.
- `@RestController`: transforma a classe em uma porta HTTP que devolve dados, normalmente JSON.
- `@Service`: marca a camada que concentra a regra de negócio.
- `@Repository`: neste caso aparece no `JpaRepository`; ele representa o acesso aos dados e fornece operações prontas.
- `@PostMapping` e `@GetMapping`: ligam métodos aos verbos e caminhos HTTP.
- `@RequestBody`: converte o JSON recebido em um objeto `Cliente`.

## Exercício 4.2 — API de clientes

A API possui `POST /clientes` para cadastrar e `GET /clientes` para listar. O cadastro continua recusando clientes menores de 18 anos, mas agora o repositório é um `JpaRepository` e os dados ficam em um banco H2 em memória.

Para testar depois de iniciar a aplicação:

```text
POST http://localhost:8080/clientes
{"nome":"Ana","idade":25}

GET http://localhost:8080/clientes
```

## Exercício 4.3 — Resumo

`@SpringBootApplication` faz o Spring encontrar os componentes sem registrar cada classe na mão. `@Service`, `@Repository` e `@RestController` dizem qual papel cada classe desempenha. O Spring cria os objetos e injeta o `ClienteRepository` no `ClienteService` e o Service no Controller. `@RequestBody` pega o JSON da requisição e transforma esse conteúdo em um objeto Java. Assim a separação da Fase 3 continua, mas a montagem da aplicação deixa de ficar espalhada pelo `main`.
