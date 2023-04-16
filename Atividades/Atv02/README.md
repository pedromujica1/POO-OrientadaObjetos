## Notebook Atividade 01 - Atv01

# Atividade
Objetivo: Criar uma classe em Java que realize cada uma das seguintes tarefas: 
* Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha; 
* Atribuir o produto de variáveis b e c para a variável a;
* Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

Para a resolução da atividade os seguintes passos foram realizados.

* Importar a classe Scanner da biblioteca java.util.
* Usar o objeto dados que utiliza a classe Scanner para ler os dados.
* Usar o metódo nextInt() da classe Scanner para ler as variáveis arg1 e arg2 como inteiros.
* Fechar o objeto leitor com o metódo .close()
* Mostrar a soma de arg1 e arg2 com o metódo print()

```
//Classe SomaArgs: Soma de valores 
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import java.util.Scanner; //Importa a classe Scanner.

public class SomaArgs { //Declara a classe SomaArgs.

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
} //Fim da classe SomaArgs.