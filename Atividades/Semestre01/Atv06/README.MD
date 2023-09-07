# Notebook Atividade 06 - Atv06

Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

# Para a resolução da atividade os seguintes passos foram realizados:

* Importar a classe Scanner da biblioteca java.util.
* Definir como double a variável jurosMensais que recebe o dado do valor dos juros.
* Usar o objeto leituraScanner que utiliza a classe Scanner para ler os dados.
* Usar o metódo nextDouble() da classe Scanner para ler as variáveis do montante e depositoFixo.
* Fechar o objeto leituraScanner com o metódo .close()
* Por meio da formúla do juros simples J  = C * i * t, calcular o J (valor do montante .subtraído pelo valor do deposito) e multiplicar a taxa de juros pelo valor do deposito.
* Definir a variável juros como double, representando o valor do montante subtraído pelo valor do deposito.
* Definir a variável capitalJuros, representando a multiplicação entre a taxa de juros e o valor do deposito.
* Definir a variável totalMeses como double, representado pela divisão entre juros e capitalJuros.
* Mostrar na tela a variável totalMeses com o printf() e configurado com o %.0f para não mostrar nenhuma casa decimal.


```java
//Classe Depositos
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import java.util.Scanner; //Importa a classe Scanner.
 
public class Depositos {
    public static void main(String[] args){
        //Declaração da variável jurosMensais
        double jurosMensais = 0.05f;

        //Inicia a classe Scanner para entrada de dados.
        Scanner leituraScanner= new Scanner(System.in); 

        System.out.print("Insira o depósito fixo mensal: "); //Imprime a mensagem.

        //Declara e inicia a variável depositoFixo
        double depositoFixo = leituraScanner.nextDouble(); 

        System.out.print("Insira o montante desejado: "); //Imprime a mensasgem.
        double montante = leituraScanner.nextDouble(); //Declara e inicia a variável montante

        leituraScanner.close(); //Fecha o objeto leituraScanner da classe Scanner.

        //formula juros simples
        //J  = C * i * t

        /*J = juros
        C = capital
        i = taxa de juros
        t = tempo (período de aplicação)
        M = montante*/

        /*Exemplo de calculo.
        
        C = 1.000
        M = 1.300
        //Juros é definido pela subtração do montante e capital
        J = 1300 – 1000 = 300
        i = 2% = 2/100 = 0,02
        t = ?

        /*
        J = C * i * t
        300 = 1000 * 0,02 * t
        300 = 20 * t
        t = 300/20
        t = 15 meses */

        //Fonte: https://mundoeducacao.uol.com.br/matematica/aplicacao-juros-simples.htm

        //Declaração da variável juros que é definido pela subtração entre o montante e o depositoFixo
        double juros = montante-depositoFixo;

        //Declaração da variável Capitaljuros que multiplica os jurosMensais pelo depositoFixo
        double capitalJuros = jurosMensais*depositoFixo;

        //Declaração da variável totalMeses que divide o valor de juros pela capitalJuros, assim descobrindo o total de meses.
        double totalMeses = juros/capitalJuros;
        
        //Imprime a variável totalMeses sem nenhuma casa decimal por isso o %.0f
        System.out.printf("São necessários %.0f meses para acumular o montante desejado \n", totalMeses);
    }//Fim do metódo main
}//Fim da classe Depositos
```
