## Maratona Java | DevDojo
# Introdução Java
### 1. Como funciona o Java?
- Java é muiltiplataforma e roda numa camada chamada JVM (Java Virtual Machine). É uma linguagem que é compilada, arquivos .JAVA são transformados em arquivos .class (bytecode) que são interpretados pela JVM, comunicando-se com o SO.
![img.png](img.png)
- Necessitamos utilizar JDK (Java Development Kit) que é um conjunto de ferramentas para desenvolvimento de softwares em Java.
- Exemplo de código em Java:

```
package academy.devdojo.maratonajava.introducao;
public class Aula01OlaDevDojo {
	public static void main(String[] args){
		System.out.println("KA-ME-HA-ME-HAAA");	
	}
}
```
- O uso de pacotes é interessante para organização das classes do projeto.
### 2. Tipos primitivos e String
- Os tipos primitivos são: int, double, float, char, byte, short, long, boolean. Variáveis declaradas fora do método (fora do escopo local) tem valor de inicialização.
- Casting: posso forçar um dado numa variável maior que a sua capacidade, por exemplo, um número muito grande num short. Resultado armazenado não é previsível. Serão cortados bits.
```
float número = (float)2500.80; 
```
- String é uma classe. Utilizar " " na declaração.
````declarative
String nome = "Lucas";
````
### 3. Operadores
- Aritiméticos: (+ - / * %)
- Aritiméticos unários: ++ --
- Lógicos: < > <= >= == != && (AND) || (OR) !(NOT). Sempre retornam valores booleanos.
  - &&: verdadeiro para todas as condições verdadeiras.
  - ||: basta uma condição verdadeira para ser verdadeiro.
- Atribuição: = += -= *= /= %=
````declarative
int number1 = 97;
int number2 = 27;
float number3 = 2.5F;
float number4 = 250.0F;
int number5 = 2;
int soma = number1+number2;
int subtracao = number1-number2;
float divisao = number4/number3;
int multiplicacao = number1 * number2;
boolean isGreaterThan = number4 >= number1;
boolean isLessThan = number4 < number1;
boolean isEqual = 'a' == number1;
boolean isDifferent = number4 != number1;
````
### 4. Estruturas condicionais
- if(condição): bloco de código será executado se condição for verdadeira.
- else: executado se condição do if for falsa.
- if else podem ser utilizados encadeados.
- Operador ternário: ***(condição) ? verdadeiro : falso***
````declarative
int idade = 18;
boolean chavesMentira = true;
boolean resultado = false;
resultado = (idade >= 18 || !chavesMentira) ? !resultado : !!resultado;
System.out.println(resultado);
````
*Variáveis locais devem ser inicializadas, evitando erro de compilação.*

- switch: Estrutura permite visualização melhor que encadear vários "if else". Se não houver inclusão do break há execução dos todos os casos após condição.

### 5. Estruturas de repetição

- while(condição){}: enquanto condição for verdadeira executa bloco de código.
- do{} while(condição): executa uma vez o bloco de código e repete laço de repetição enquanto a condição for verdadeira.
- for(iterador, condição, ação): define um iterador, enquanto condição for verdadeira realizará a ação. Pode-se utilizar break para parar iteração. Continue ignora linhas subsequentes e realiza iteração.

### 6. Arrays

- Alocação de dados contígua na memória. A declaração de um Array faz referência a um objeto de memória. Não podemos acessar posição que não existe no Array. Podemos iterar sobre posições do Array(indexado a partir do 0). Tamanho do Array não pode ser aumentado dinamicamente. Ao realizar nova atribuição à Array declarado (Array = new Array[]) perde-se a referência antiga da memória e é atribuída uma nova.

*Variáveis de referência (Array, String) tem valor de inicialização nulo.*

### 7. Arrays Multidimensionais

- Na declaração a base deve ter tamanho definido. 

***Modificadores de acesso: private -> default -> protected -> public***

# Introdução JavaCore

### 1. Classes - Introdução

- Uma classe vai definir um conjunto de dados variados, alocados no mesmo espaço de memória, obtendo-se um objeto (variável do tipo reference). Uma classe é um agrupamento de coisas do mundo real representadas por um objeto (carro, pessoa, etc).
- Domínio, model, domain: Classes que representam lógica de negócio.
- Ao criarmos um novo objeto sem atribuição de valores, eles têm atribuídos valores padrão.
- Coesão é relacionada à aglutinação de objetos por sua especificidade, visando escalabilidade, por exemplo.
- Podemos mudar o apontamento das variáveis de referência. Os objetos precisam ser do mesmo tipo.

***Classes de domínio representam algo do mundo real.***

### 2. Métodos - Introdução

- Servem para executar alguma operação, podem ter retorno ou não(void). Podemos usar return como um "break-point" para uma função void. 
- Quando passamos variáveis do tipo primitivo num método, passamos uma cópia. Quando passamos objeto como argumento, passamos a sua referência na memória.
- This faz referência ao próprio objeto, todavia, depende do contexto.
- var args (...): Forma de passar vários elementos de um mesmo tipo para um método, java vai transformar valores num array. VarArgs deve sempre ser o último parâmetro.

### 3. Modificadores de acesso

- Acoplamento é "o quanto uma classe conhece da outra".
- Modificador de acesso privado: atributos só podem ser acessados pelo objeto. Podemos criar atributos privados com métodos públicos para acessá-los, deve-se utilizar "set" para atribuir valores, por exemplo, na nomeação do método (setNome) e "get" para recuperar algum valor (getNome). 

### 4. Sobrecarga de métodos

- Sobrecarga é relacionada ao nome, quantidade ou tipo dos parâmetros que devem ser divergentes na realização da sobrecarga, senão haverá ambiguidade.

### 5. Construtores

- Construtores não têm retorno.
- this(): Sintaxe para chamar um construtor dentro de outro, por exemplo, na adição de uma propriedade, para não mudarmos a assinatura do método, utiliza-se em outro construtor. Ele deve estar na primeira linha do construtor obrigatoriamente. Parece um acesso recursivo ao construtor.

### 6. Blocos de inicialização

- {}: Também chamdo de instância. Deve ser criado antes do construtor. É executado sempre que é criada instância do construtor.

### 7. Modificador static

- Sempre inserir após modificador de acesso. Atributo pertence à classe, não ao objeto. Todos os objetos compartilham mesmo valor.
- Criar método estático quando métodos não acessam variável da instância.
- Podemos declarar blocos estáticos e chamar métodos estáticos dentro deles. Eles carregam somente uma vez. Se houver mais de um bloco estático eles serão executados na ordem que foram inseridos.
- Não é correto acessarmos variáveis static através da variável de referência.

### 8. Associações

- Relacionamento entre duas classes. Pode ser 1 - 1, 1 - n ou n - n. (has a).

### 9. Leitura de dados pelo console

- Utilizamos a classe Scanner para entrada de dados no Java. System.in como argumento.
```
  Scanner entrada = new Scanner(System.in);
```

### 10. Herança

- Herança (is a). Podemos estender uma classe à outra, implicando na herança dos atributos e métodos, mantendo o relacionamento entre elas. Forte acoplamento.
- Não se pode extender mais de uma classe diretamente. Não existe herança múltipla.
```
Class Funcionario extends Pessoa;
```
- Sobrescrita: podemos sobrescrever o método da classe "Mãe", com a mesma assinatura. Utilizamos a palavra super para referenciar o método da classe mais genérica.
```
pubic void imprime(){
super.imprime();
System.out.println(this.salario);
}
```
- ***Protected***: modificador de acesso. Qualquer subclasse em qualquer pacote terá acesso aos atributos como se estivesse na classe "mãe". Acesso direto à todas as variáveis, independente onde estiverem, porém, todas as classes do mesmo pacote também terão acesso.
- Também pode-se passar o super para herança do construtor.

### 11. Sobrescrita - Método toString()

- Para realizar sobrescrita, nome do método e quantidade de parâmetros devem ser os mesmos.
- Modificador de acesso não pode ser mais restritivo do que definido.
- Utilizamos @Override para sobrescrever o método toString(). Mudando, por exemplo, sua saída.
```
    @Override
    public String toString(){        return "Nome " + this.nome;}
```

### 12. Modificador final

- Constantes em Java são definidas pelo modificador final. Devemos informar valor de inicialização. Por convenção, nome da variável deve ser maiúsculo, separados por "_". A utilização do static também é comum para constantes que não vão ter valor alterado.
```
private static final String NOME_PROPRIO = new String("Alice");
```
- final com variável de referência, significa que a referência (Objeto) não pode ser alterada, mas os atributos e métodos podem.
- final para classes e métodos está lidando diretamente com herança.
- final class: evita que a classe seja estendida, não permite que método() seja sobrescrito.

### 13. Enumeração

- Tipo especial de classe onde todos os atributos são constantes.
- Também podemos declarar enumeração numa classe.
- Posso associar os atributos informados no enum a uma numeração, acessando construtor dentro do enum.

### 14. Classes Abstratas

- Utilizando na classe ela vira um template. Não pode ser instanciada. Classes abstratas podem ter métodos concretos e abstratos. Não pode haver método abstrato em classe concreta.
- Método não pode ter corpo. Subclasses realizam implementação obrigatória.
- Se uma classe abstrata estende outra classe abstrata, ela não é obrigada a implementar os métodos abstratos dela.
- São "contratos".

### 15. Interfaces

- Todos os métodos são public e abstract. Utilizamos implements.
- Uma classe pode implementar múltiplas interfaces.
- Pode-se utilizar default para implementação de um método numa interface.
- Pode-se declarar atributos, todos são public static final.
- Pode-se incluir métodos static.
- São "contratos".

### 16. Polimorfismo

- Múltiplas formas. Trocar o tipo da variável de referência, mas continuar utilizando outros objetos.
- Widening cast: Assinar uma referência de objeto da subclasse para uma variável da superclasse.
- Narrowing cast: assinar uma referência de objeto da superclasse para uma variável da subclasse.
- Podemos utilizar a interface como referência de um objeto que implementa um método seu.