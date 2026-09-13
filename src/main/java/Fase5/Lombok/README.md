# Fase 5 — Lombok

O Lombok gera durante a compilação os métodos repetitivos que antes eram escritos à mão. Ele não faz a lógica aparecer em tempo de execução; as anotações orientam o compilador a gerar getters, setters e construtores.

## Exercício 5.1 — Refatorar a entidade

`Fase5.Lombok.Model.Cliente` usa `@Getter`, `@Setter` e `@NoArgsConstructor` no lugar dos métodos e do construtor vazio escritos manualmente. Não usei `@Data` na entidade: em entidades JPA com relacionamentos, `equals`, `hashCode` e `toString` automáticos podem percorrer os dois lados da associação e causar loop ou problemas com carregamento tardio.

## Exercício 5.2 — Injeção de dependência

`Fase5.Lombok.Service.ClienteService` usa `@RequiredArgsConstructor`. Como o `ClienteRepository` é `final`, o Lombok gera o construtor necessário para o Spring fazer a injeção por construtor.

## Exercício 5.3 — Builder

`Pedido` usa `@Builder`, e `MainLombok` cria um pedido encadeando `descricao`, `valor`, `dataCriacao` e `cliente`. Para uma classe com vários campos, achei o Builder mais fácil de ler porque cada valor fica identificado pelo nome, sem depender da ordem dos parâmetros.

## Exercício 5.4 — Cuidado com `@Data`

`Cliente` tem uma lista de `Pedido`, e 
`Pedido` ap onta de volta para `Cliente`. Se as duas entidades usassem `@Data`, o `toString()` e os métodos de igualdade poderiam ficar percorrendo a associação sem fim. Por isso usei getters e setters separados, `@ToString(onlyExplicitlyIncluded = true)` e excluí os relacionamentos com `@ToString.Exclude`.