<div align="center">

# ☕ Primeiro Curso de Java | Alura

### Aprendendo os fundamentos da linguagem Java

<img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=18&duration=3000&pause=1000&color=F89820&center=true&vCenter=true&width=600&lines=Estudando+Java+17;Primeiros+passos+na+programa%C3%A7%C3%A3o+Java;Exerc%C3%ADcios+e+desafios+da+Alura" />

</div>

<p align="center">

<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img src="https://img.shields.io/badge/Oracle-JDK_17-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>

<img src="https://img.shields.io/badge/IntelliJ_IDEA-IDE-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/>

<img src="https://img.shields.io/badge/Alura-Curso-051933?style=for-the-badge&logo=alura&logoColor=00C86F"/>

</p>

---

## 📌 Sobre o Projeto

Este repositório reúne os exercícios, desafios e anotações desenvolvidos durante o curso **"Java: criando a sua primeira aplicação"**, da **Alura**.

O objetivo é documentar minha evolução no aprendizado da linguagem Java, registrando desde os conceitos fundamentais até a construção de pequenos projetos práticos, servindo como material de consulta para estudos futuros.

---

## 📚 Sumário

- [O que é Java?](#o-que-e-java)
- [Instalando o Java (JDK 17)](#instalando-o-java)
- [O que significa LTS?](#lts)
- [JDK, JRE e JVM](#jdk-jre-e-jvm)
- [Como funciona a execução de um programa Java](#execucao-java)
- [IntelliJ IDEA](#intellij)
- [Estrutura do Projeto (SRC)](#src)
- [Variáveis](#variaveis)
- [Tipos Primitivos](#tipos-primitivos)
- [String](#string)
- [Casting](#casting)
- [Operadores de Incremento](#incremento)
- [Scanner](#scanner)
- [Estruturas Condicionais](#condicionais)
- [Estruturas de Repetição](#loops)
- [Text Blocks](#text-blocks)
- [.formatted()](#formatted)
- [String.format()](#string-format)
- [Comparando Strings](#comparando-strings)
- [Palavras-chave](#palavras-chave)
- [Convenções de Código Java](#convencoes)
- [Boas Práticas](#boas-praticas)
- [Exercícios Desenvolvidos](#exercicios-desenvolvidos)
- [Resumo](#resumo)

---

<a id="o-que-e-java"></a>
# O que é Java?

Java é uma linguagem de programação **orientada a objetos**, criada pela Sun Microsystems (atualmente pertencente à Oracle).

Seu maior diferencial é o lema:

> **"Write Once, Run Anywhere"**
>
> Escreva uma vez e execute em qualquer lugar.

Isso é possível graças à **JVM (Java Virtual Machine)**, responsável por executar programas Java em diferentes sistemas operacionais.

Java é amplamente utilizado em:

- Desenvolvimento Web
- Aplicações Desktop
- Android
- Sistemas Bancários
- APIs REST
- Microsserviços
- Sistemas Corporativos

---
<a id="instalando-o-java"></a>
# Instalando o Java (JDK 17)

A instalação do Java pode ser feita diretamente pelo site oficial da Oracle.

🔗 https://www.oracle.com/java/technologies/downloads/

Durante o curso foi utilizada a versão **Java 17 LTS**.

---
<a id="lts"></a>
# O que significa LTS?

**LTS** significa:

> **Long Term Support**

São versões que recebem suporte e atualizações por vários anos, sendo as mais utilizadas em empresas.

Exemplos:

- Java 17 LTS
- Java 21 LTS
- Java 25 LTS

---
<a id="jdk-jre-e-jvm"></a>
# JDK, JRE e JVM

Esses três componentes trabalham juntos para que uma aplicação Java funcione.

## JDK (Java Development Kit)

É o kit utilizado pelos desenvolvedores.

Contém:

- compilador (`javac`)
- JVM
- JRE
- bibliotecas
- ferramentas de desenvolvimento

Sem o JDK não é possível criar programas Java.

---

## JRE (Java Runtime Environment)

É o ambiente responsável por executar programas Java.

Contém:

- JVM
- bibliotecas necessárias para execução

O JRE não possui ferramentas de desenvolvimento.

---

## JVM (Java Virtual Machine)

É a máquina virtual responsável por executar o código Java.

Ela interpreta o **Bytecode** gerado pelo compilador e o transforma em instruções que o sistema operacional consegue entender.

Cada sistema operacional possui sua própria JVM.

---
<a id="execucao-java"></a>
# Como funciona a execução de um programa Java

```text
Arquivo .java
      │
      ▼
Compilador Java (javac)
      │
      ▼
Arquivo .class (Bytecode)
      │
      ▼
JVM
      │
      ▼
Sistema Operacional
```

### Etapas

1. Escrevemos o código em um arquivo `.java`.
2. O compilador (`javac`) transforma esse código em **Bytecode** (`.class`).
3. A JVM interpreta esse Bytecode.
4. A JVM envia as instruções para o sistema operacional.
5. O programa é executado.

---
<a id="intellij"></a>
# IntelliJ IDEA

O IntelliJ IDEA é uma das IDEs mais utilizadas para desenvolvimento Java.

Algumas vantagens:

- Autocompletar código
- Correção automática
- Debug
- Organização do projeto
- Integração com Git
- Execução rápida dos programas

---
<a id="src"></a>
# Estrutura do projeto

Ao criar um projeto Java, normalmente encontramos a pasta:

```text
src/
```

## SRC

A pasta **src** (source) armazena todos os arquivos `.java` do projeto.

Exemplo:

```text
MeuProjeto
│
├── src
│   ├── Main.java
│   ├── Pessoa.java
│   └── Produto.java
│
└── out
```

---
<a id="variaveis"></a>
# Variáveis

Variáveis são espaços na memória utilizados para armazenar informações.

Exemplo:

```java
int idade = 20;
```

---
<a id="tipos-primitivos"></a>
# Tipos Primitivos

Java possui oito tipos primitivos.

| Tipo | Descrição | Exemplo |
|-------|-----------|----------|
| byte | inteiro pequeno | 10 |
| short | inteiro curto | 100 |
| int | inteiro | 500 |
| long | inteiro grande | 100000L |
| float | decimal simples | 5.5f |
| double | decimal dupla precisão | 5.5 |
| char | caractere | 'A' |
| boolean | verdadeiro ou falso | true |

---
<a id="string"></a>
# String

`String` representa uma sequência de caracteres.

```java
String nome = "Beatriz";
```

Diferentemente dos tipos primitivos, **String é uma classe**.

---
<a id="casting"></a>
# Casting

Casting é a conversão entre tipos de dados.

## Casting Implícito

Acontece automaticamente.

```java
int idade = 20;

double valor = idade;
```

---

## Casting Explícito

Necessário quando pode ocorrer perda de informação.

```java
double nota = 8.7;

int notaInteira = (int) nota;
```

Resultado:

```text
8
```

---
<a id="incremento"></a>
# Operadores de Incremento

## Pré-incremento

Primeiro incrementa, depois utiliza o valor.

```java
int numero = 5;

System.out.println(++numero);
```

Saída:

```text
6
```

---

## Pós-incremento

Primeiro utiliza o valor, depois incrementa.

```java
int numero = 5;

System.out.println(numero++);
```

Saída:

```text
5
```

Após a execução:

```java
numero == 6
```

---
<a id="scanner"></a>
# Scanner

A classe `Scanner` permite ler informações digitadas pelo usuário.

Primeiro é necessário importar:

```java
import java.util.Scanner;
```

Depois criar o objeto:

```java
Scanner scanner = new Scanner(System.in);
```

---

## nextLine()

Lê uma linha inteira.

```java
String nome = scanner.nextLine();
```

---

## nextInt()

Lê um número inteiro.

```java
int idade = scanner.nextInt();
```

---

## nextDouble()

Lê números decimais.

```java
double salario = scanner.nextDouble();
```

---
<a id="condicionais"></a>
# Estruturas Condicionais

As estruturas condicionais permitem que o programa tome decisões com base em uma condição.

## if

Executa um bloco de código caso uma condição seja verdadeira.

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

---

## if / else

Permite definir um caminho alternativo quando a condição é falsa.

```java
if (saldo >= valorSaque) {
    saldo -= valorSaque;
} else {
    System.out.println("Saldo insuficiente.");
}
```

---

## if / else if / else

Utilizado quando existem várias condições possíveis.

```java
if (nota >= 9) {
    System.out.println("Excelente");
} else if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

---

## switch

Ideal para selecionar uma entre várias opções de forma mais organizada.

```java
switch (opcao) {
    case 1:
        System.out.println("Consultar saldo");
        break;

    case 2:
        System.out.println("Depositar");
        break;

    case 3:
        System.out.println("Sacar");
        break;

    default:
        System.out.println("Opção inválida.");
}
```

A instrução `break` encerra o caso atual, evitando que os próximos casos também sejam executados.

---
<a id="loops"></a>
# Estruturas de Repetição (Loops)

Os loops permitem executar um bloco de código diversas vezes, evitando repetição de código.

## while

Executa enquanto a condição for verdadeira.

```java
int contador = 1;

while (contador <= 5) {
    System.out.println(contador);
    contador++;
}
```

É indicado quando **não sabemos exatamente quantas vezes** o laço será executado.

---

## for

Muito utilizado quando sabemos previamente a quantidade de repetições.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

O `for` possui três partes:

- Inicialização da variável de controle;
- Condição de repetição;
- Atualização da variável.

Estrutura geral:

```java
for (inicialização; condição; incremento) {
    // código
}
```

---

# Quando utilizar cada estrutura?

| Estrutura | Quando utilizar |
|-----------|-----------------|
| `if` | Quando existe apenas uma condição. |
| `if / else` | Quando há dois caminhos possíveis. |
| `if / else if / else` | Quando existem várias condições diferentes. |
| `switch` | Quando a decisão depende de um único valor com diversas opções. |
| `while` | Quando a quantidade de repetições é desconhecida. |
| `for` | Quando a quantidade de repetições é conhecida. |

---
<a id="text-blocks"></a>
# Text Blocks

Permitem escrever textos com múltiplas linhas de forma muito mais organizada.

Antes:

```java
String texto =
"Linha 1\n" +
"Linha 2\n" +
"Linha 3";
```

Depois:

```java
String texto = """
Linha 1
Linha 2
Linha 3
""";
```

Muito utilizado para menus, consultas SQL e mensagens grandes.

---
<a id="formatted"></a>
# .formatted()

Substitui valores dentro de uma String.

```java
String nome = "Beatriz";

String mensagem = """
Olá %s!
""".formatted(nome);
```

Resultado:

```text
Olá Beatriz!
```

---
<a id="string-format"></a>
# String.format()

Também permite formatar textos.

```java
String texto = String.format(
    "Nome: %s - Idade: %d",
    nome,
    idade
);
```

Muito útil para criar mensagens formatadas.

---
<a id="comparando-strings"></a>
# Comparando Strings

## equals()

Compara o conteúdo das Strings.

```java
String nome = "Java";

nome.equals("Java");
```

Resultado:

```text
true
```

---

## equalsIgnoreCase()

Compara ignorando letras maiúsculas e minúsculas.

```java
nome.equalsIgnoreCase("JAVA");
```

Resultado:

```text
true
```

---
<a id="palavras-chave"></a>
# Palavras-chave (Keywords)

São palavras reservadas da linguagem Java e não podem ser utilizadas como nomes de variáveis, métodos ou classes.

Alguns exemplos:

```java
class
public
private
protected
static
void
if
else
switch
case
for
while
do
break
continue
return
new
this
super
try
catch
finally
throw
throws
package
import
interface
enum
extends
implements
final
abstract
```

---
<a id="convencoes"></a>
# Convenções de Código Java

Seguir um padrão de escrita facilita a leitura, manutenção e colaboração entre desenvolvedores.

## Classes

Utilizam **PascalCase** (Upper Camel Case).

```java
public class CadastroCliente
```

---

## Variáveis

Utilizam **camelCase**.

```java
String nomeCliente;
```

---

## Métodos

Também utilizam **camelCase**.

```java
public void calcularMedia()
```

---

## Constantes

Utilizam letras maiúsculas separadas por `_`.

```java
final int MAX_TENTATIVAS = 5;
```

---

## Limite de linhas

Recomenda-se manter linhas com aproximadamente **80 caracteres**, facilitando a leitura em diferentes editores.

---

## Comentários

Os comentários devem explicar **o motivo** ou a intenção do código, evitando comentários óbvios.

Bom exemplo:

```java
// Verifica se o saldo é suficiente antes do saque
```

Evite:

```java
// Soma um ao número
numero++;
```

---
<a id="boas-praticas"></a>
# Boas práticas

- Utilize nomes de variáveis descritivos.
- Evite números "mágicos" no código.
- Organize o código em métodos quando necessário.
- Feche recursos como `Scanner` utilizando `close()`.
- Indente corretamente o código.
- Evite repetição de código.
- Utilize constantes para valores fixos.

---

<a id="exercicios-desenvolvidos"></a>

## 🧪 Exercícios Desenvolvidos

Durante o curso foram desenvolvidos diversos exercícios para praticar os conceitos fundamentais da linguagem Java.

### 📂 Aula 2

| Classe | Conceito praticado |
|---------|--------------------|
| `MediaNotas` | Cálculo da média entre notas utilizando operadores aritméticos. |
| `ConversaoTemperatura` | Conversão entre Celsius e Fahrenheit utilizando fórmulas matemáticas. |
| `ConversaoDolarReal` | Conversão de moedas utilizando variáveis e operações matemáticas. |
| `CalculoDesconto` | Cálculo de descontos percentuais sobre produtos. |
| `Casting` | Conversão implícita e explícita entre tipos numéricos. |
| `CharString` | Diferenças entre `char` e `String`. |
| `Produto` | Criação e manipulação de variáveis representando um produto. |

---

### 📂 Aula 3

| Classe | Conceito praticado |
|---------|--------------------|
| `ExemploScanner` | Entrada de dados utilizando a classe `Scanner`. |
| `Condicionais` | Estruturas `if`, `else` e `else if`. |
| `ComparacaoNumeros` | Comparação entre valores utilizando operadores relacionais. |
| `CalcularArea` | Cálculo da área de figuras geométricas utilizando `Scanner`, `switch`, `while` e operações matemáticas.|
| `NumeroPositivoNegativo` | Verificação de números positivos e negativos. |
| `ImparPar` | Utilização do operador `%` para identificar números pares e ímpares. |
| `LoopWhile` | Estrutura de repetição `while`. |
| `LoopFor` | Estrutura de repetição `for`. |
| `Tabuada` | Geração da tabuada utilizando laços de repetição. |
| `Fatorial` | Cálculo do fatorial utilizando estruturas de repetição. |
| `NumeroAleatorio` | Jogo de adivinhação utilizando `Random`, `Scanner`, condicionais e loops. |

---

### 📂 Desafios

| Classe | Objetivo |
|---------|----------|
| `DesafioBanco` | Simulação de um sistema bancário com consulta de saldo, depósito, saque e menu interativo utilizando `switch`, `while` e `Scanner`. |
| `ScreenMatch` | Primeiro projeto do curso, aplicando os conceitos fundamentais da linguagem Java na construção de uma aplicação simples. |

---

### 💡 Conceitos praticados nos exercícios

- Variáveis
- Tipos primitivos
- Operadores aritméticos
- Operadores relacionais
- Casting
- Entrada de dados (`Scanner`)
- Estruturas condicionais
- Estruturas de repetição
- Geração de números aleatórios (`Random`)
- Boas práticas de organização do código
- Convenções de nomenclatura

---
<a id="resumo"></a>
# Resumo

Esses conceitos formam a base para o desenvolvimento de aplicações Java e serão utilizados em tópicos mais avançados, como orientação a objetos, coleções, tratamento de exceções e desenvolvimento com Spring Boot.
