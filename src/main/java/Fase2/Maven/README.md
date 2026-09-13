# Fase 2 — Maven

O Maven cuida das dependências e do ciclo de build do projeto. Em vez de baixar um `.jar` manualmente e configurar o classpath, declaramos a biblioteca no `pom.xml`.

## Respostas do exercício 2.1

- `groupId`: `org.example`.
- `artifactId`: `estudos-java`.
- Java configurado: versão 21.
- Antes deste exercício não havia dependências declaradas; agora existe `commons-lang3`, versão `3.14.0`.

## Exercício 2.2

O Maven baixa `commons-lang3` para o repositório local `.m2` foi baixado com sucesso, em `C:\Users\user\.m2\repository\commons-lang`.

## Exercício 2.3

`Fase2.Maven.Main` usa `StringUtils.isBlank()` para confirmar que a biblioteca foi realmente adicionada ao classpath.

Ao executar `mvn clean package`, o Maven passa por limpeza, compilação, testes e empacotamento. O `.jar` final fica em `target/estudos-java-1.0-SNAPSHOT.jar`. Nesta execução, o tempo registrado foi de aproximadamente **17,830 segundos**.
