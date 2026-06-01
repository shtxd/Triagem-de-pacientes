# Sistema de Triagem de Pacientes 

Este é um programa em Java feito para ajudar um posto de saúde a cadastrar pessoas e descobrir rapidamente quem precisa de atendimento urgente.

## O que o programa faz?

1. **Cadastro:** O programa pede para você digitar os dados de **5 pacientes**:
   * Nome
   * Idade
   * Temperatura
   * Pressão Arterial

2. **Análise de Risco:** Assim que os dados são digitados, o próprio sistema analisa a saúde do paciente e o classifica em três níveis:
   * **Alto risco:** Se a temperatura for maior que 39°C OU a pressão for maior que 18.
   * **Médio risco:** Se a temperatura estiver entre 37°C e 39°C.
   * **Baixo risco:** Para todos os outros casos (temperatura e pressão normais).

3. **Relatório Final:** No final, o programa mostra na tela uma lista com todos os 5 pacientes organizados, exibindo os seus dados e o resultado da sua triagem (Risco Alto, Médio ou Baixo).

## Como testar no seu computador

1. Abra o arquivo do código no seu programa de preferência (como Eclipse, VS Code ou IntelliJ).
2. Rode o programa.
3. Digite os dados dos 5 pacientes conforme forem pedidos no terminal.
4. Veja o relatório final aparecer na tela automaticamente.

## Como compilar e rodar

No terminal, dentro da pasta do projeto:

```powershell
javac -d bin src\*.java
java -cp bin Main
```

Isso compila os arquivos Java em `bin/` e executa o programa principal.
