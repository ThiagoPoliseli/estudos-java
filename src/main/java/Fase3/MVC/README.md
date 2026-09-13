# Fase 3 — Arquitetura MVC

Nesta fase a aplicação foi separada em três responsabilidades:

- `Cliente`: representa os dados, ou seja, o Model.
- `ClienteController`: recebe a entrada e encaminha a operação.
- `ClienteService`: concentra a regra de negócio.
- `ClienteRepository`: salva, lista e busca dados.

## Exercício 3.1

Se a validação de idade estivesse no `ClienteController`, a camada errada estaria tomando uma decisão de negócio. O Controller só deveria receber a requisição e devolver uma resposta; a regra “cliente precisa ter 18 anos” pertence ao Service. O acesso aos dados pertence ao Repository.

## Exercício 3.2

`MainMVC` cadastra um cliente válido, tenta cadastrar um menor de idade, lista todos e busca por id. A cadeia é explícita: Controller → Service → Repository.

## Exercício 3.3

`CadastroProgramado` é um segundo ponto de entrada que usa o mesmo `ClienteService` sem passar pelo Controller. Isso só funciona bem porque a validação está no Service; se estivesse presa ao Controller, esse outro fluxo teria que duplicar a regra.
