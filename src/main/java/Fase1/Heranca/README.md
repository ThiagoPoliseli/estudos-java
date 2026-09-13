Funcionario ainda é uma classe normal nesta etapa. `Gerente` e `Vendedor` reutilizam o atributo `nome` e sobrescrevem `calcularSalario()`.

No `MainHeranca`, a lista é declarada como `List<Funcionario>`, mas contém objetos `Gerente` e `Vendedor`. Ao chamar `calcularSalario()`, o Java usa o método do tipo real do objeto; isso é polimorfismo.

O mesmo comportamento aparece no exemplo `Animal`, `Cachorro` e `Gato`: todos podem ser tratados como `Animal`, mas cada classe responde com seu próprio som.
