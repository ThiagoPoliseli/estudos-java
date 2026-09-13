# Etapa 3 — Interfaces

Uma interface define um contrato. `Descontavel` exige `aplicarDesconto()` e `Taxavel` exige `calcularImposto()`.

`Produto` implementa as duas interfaces e também `Auditavel`, aproveitando o método `default` `gerarLogAuditoria()` sem precisar reescrevê-lo.

Interfaces não representam uma classe-base com estado compartilhado, e uma classe pode implementar várias interfaces ao mesmo tempo.
