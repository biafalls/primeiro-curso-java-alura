# ☕ Java - Primeiros Passos

Este repositório reúne os principais conceitos estudados durante o curso **Java:
Criando a sua primeira aplicação**, desde a instalação da linguagem até os fundamentos necessários para desenvolver aplicações no IntelliJ IDEA.

---

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

# Instalando o Java (JDK 17)

A instalação do Java pode ser feita diretamente pelo site oficial da Oracle.

🔗 https://www.oracle.com/java/technologies/downloads/

Durante o curso foi utilizada a versão **Java 17 LTS**.

---

# O que significa LTS?

**LTS** significa:

> **Long Term Support**

São versões que recebem suporte e atualizações por vários anos, sendo as mais utilizadas em empresas.

Exemplos:

- Java 17 LTS
- Java 21 LTS
- Java 25 LTS

---

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

# Variáveis

Variáveis são espaços na memória utilizados para armazenar informações.

Exemplo:

```java
int idade = 20;
```

---

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

# String

`String` representa uma sequência de caracteres.

```java
String nome = "Beatriz";
```

Diferentemente dos tipos primitivos, **String é uma classe**.

---

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

# Boas práticas

- Utilize nomes de variáveis descritivos.
- Evite números "mágicos" no código.
- Organize o código em métodos quando necessário.
- Feche recursos como `Scanner` utilizando `close()`.
- Indente corretamente o código.
- Evite repetição de código.
- Utilize constantes para valores fixos.

---

# Resumo

Durante esta etapa foram estudados os principais fundamentos da linguagem Java:

- Instalação do Java 17 LTS
- IntelliJ IDEA
- Estrutura de projetos
- Pasta `src`
- JDK, JRE e JVM
- Processo de compilação e execução
- Variáveis
- Tipos primitivos
- Strings
- Comparação de Strings
- Casting
- Scanner
- Condicionais
- Loops
- Text Blocks
- `.formatted()`
- `String.format()`
- Operadores de incremento
- Palavras-chave
- Convenções de código Java
- Boas práticas de programação

Esses conceitos formam a base para o desenvolvimento de aplicações Java e serão utilizados em tópicos mais avançados, como orientação a objetos, coleções, tratamento de exceções e desenvolvimento com Spring Boot.
