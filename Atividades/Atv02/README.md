# Notebook Atividade 02 - Atv02

Objetivo: Criar uma classe em Java que realize cada uma das seguintes tarefas: 
* Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha; 
* Atribuir o produto de variáveis b e c para a variável a;
* Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento.

## Para a resolução da atividade os seguintes passos foram realizados:

* Importar a classe Scanner da biblioteca java.util.
* Declarar a variável "c" como inteira e atribuir algum valor a ela.
* Usar o objeto dados que utiliza a classe Scanner para ler o input.
* Para mostrar a mensagem "Informe um inteiro" é usado o metódo print para ficar na mesma linha.
* Usar o metódo nextInt() da classe Scanner para ler a variável "b" como inteira.
* Fechar o objeto leitor com o metódo .close()
* Declarar a variável a com a multiplicação entre b e c.
* Mostrar na tela a variável a.

```
/Classe ProdutoABC
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import java.util.Scanner; //Importa a classe Scanner.

public class ProdutoABC {//Declaração da classe ProdutoABC
    public static void main(String [] args){ //Inicialização do metódo main.
        int c = 42; //Declaração da variável c

        Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados

        System.out.print("Informe um inteiro: "); //Impressão da imagem.
        int b = dados.nextInt(); //Declaração da variável b.
        dados.close(); //Fechando o objeto dados da classe Scanner

        int a = b*c;//Declaração de variável a que realiza a multiplicação entre b e c
        System.out.println("Valor da variável c: " + c); //Impressão da variável c.
        System.out.println("Valor da variável b: "+ b); //Impressão da variável b.
        //Impressão do resultado como um programa de exemplo de folha de pagamento
        System.out.println("Folha de pagamento: R$" +a +".00");//Impressão da variável a.
    }//Fim do metódo main()
}//Fim da classe ProdutoABC.
```
