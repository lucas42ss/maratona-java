## Maratona Java | DevDojo
1. Como funciona o Java?
- Java é muiltiplataforma e roda numa camada chamada JVM (Java Virtual Machine). É uma linguagem que é compilada, 
arquivos .JAVA são transformados em arquivos .class (bytecode) que são interpretados pela JVM, comunicando-se com o SO.
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
- O uso de pacotes é interessante para organização das classes dos projetos.
2. Tipos primitivos e String
- Os tipos primitivos são: int, double, float, char, byte, short, long, boolean.
- Casting: posso forçar um dado dentro de um variável mesmo sendo maior que sua capacidade, por exemplo, um número muito grande em um short. Resultado armazenado não previsível. Serão cortados bits.
```
float número = (float)2500.80; 
```
- String é uma classe. Utilizar "" na declaração.