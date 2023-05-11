//Classe Poltronas
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */

import java.util.Arrays;//Importa a biblioteca Arrays

import java.util.Scanner; //Importa a classe Scanner.



public class Poltronas {//Início da classe Poltronas
    public static void main(String[]args){//Declaração e inicialização do metódo main

        Boolean[] poltronas1 = {false,false,false,false,false};

        Boolean[] poltronasEconomicas = {false,false,false,false,false};

        Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados.
        
        int index1=0;//
        int index2=0;
        boolean verificador = true;

        while (verificador){

            System.out.println("Insira um número: "); //Imprime a mensagem de escolha.
            System.out.println("Digite 1 para atribuir assentos na primeira classe ");
            System.out.println("Digite 2 para atribuir assentos na classe econômica ");
            int input = dados.nextInt(); //Declara e inicia a variável input
            

            if (input == 1) {

                poltronas1[index1]=true;
                index1++;

                if (index1 == 5){
                    System.out.println("A Primeira classe está cheia");
                    break;
                }
                System.out.println(Arrays.asList(poltronas1));
                System.out.println("Poltronas: "+Arrays.asList(poltronas1));
                System.out.println("Poltrona escolhida: "+poltronas1[index1]);
            }

            if (input ==2) {

            
                poltronasEconomicas[index2]=true;
                index2++;

                if (index2== 5){
                    System.out.println("A classe econômica está cheia");
                    System.out.println("Deseja comprar uma poltrara na classe 1?");
                    break;
                }
                System.out.print(Arrays.asList(poltronasEconomicas));
                System.out.println("Poltronas: "+Arrays.asList(poltronasEconomicas));
                System.out.println("Poltrona escolhida: "+poltronasEconomicas[index2]);

            }
           
        }
        dados.close();
        
    
        
    }//Fim do metódo main

}
//Fim da classe Poltronas
