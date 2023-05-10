//Classe SomaArgs
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import java.util.Scanner; //Importa a classe Scanner.

public class SomaArgs { //Declara a classe ex1.

  //Declara método main, que dá início ao programa.
  public static void main(String[] args) {

    Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados.

    System.out.print("Insira o primeiro número: "); //Imprime a mensagem.
    int arg1 = dados.nextInt(); //Declara e inicia a variável arg1.

    System.out.print("Insira o segundo número: "); //Imprime a mensasgem.
    int arg2 = dados.nextInt(); //Declara e inicia a variável arg2.

    dados.close(); //Fecha o objeto dados da classe Scanner.

    System.out.print("O resultado da soma é: "); //Imprime a mensagem.
    System.out.println(arg1+arg2); //Imprime a soma de arg1 e arg2.
  }//Fim do método main.
} //Fim da classe ex1.
