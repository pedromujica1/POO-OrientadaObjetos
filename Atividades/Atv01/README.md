## Notebook Atividade 02 - Atv02

# Atividade
Objetivo: Criar uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.
Para a resolução da atividade os seguintes passos foram realizados.

* Importar a classe Scanner da biblioteca java.util.
* Usar o objeto dados que utiliza a classe Scanner para ler os dados.
* Usar o metódo nextInt() da classe Scanner para ler as variáveis arg1 e arg2 como inteiros.
* Fechar o objeto leitor com o metódo .close()
* Mostrar a soma de arg1 e arg2 com o metódo print()

```
//Classe ProdutoABC
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
