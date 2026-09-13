# Etapa 5 — Sobrescrição

Sobrescrição acontece quando uma subclasse redefine um método da superclasse com a mesma assinatura.

`Funcionario.calcularBonus()` possui uma regra genérica, enquanto `Gerente` e `Vendedor` sobrescrevem o método com regras próprias.

`@Override` avisa ao compilador que a intenção é sobrescrever. Se o nome ou os parâmetros estiverem errados, o compilador acusa o problema.
