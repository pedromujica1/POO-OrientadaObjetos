//Classe Poltronas
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */

import java.util.Arrays;//Importa a biblioteca Arrays

import java.util.Scanner; //Importa a classe Scanner.



public class Poltronas {//Início da classe Poltronas
    public static void main(String[]args){//Declaração e inicialização do metódo main

        boolean[] poltronas1 = {false,false,false,false,false};

    

        boolean[] poltronasEconomicas = {false,false,false,false,false};

        Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados.
        
        int index1=0;//
        int index2=0;
        boolean verificador = true;

        
        while (verificador){
            int poltransEco = 5;

            System.out.println("Insira um número: "+ "\n"); //Imprime a mensagem de escolha.
            System.out.println("Digite 1 para atribuir assentos na primeira classe "+ "\n");
            System.out.println("Digite 2 para atribuir assentos na classe econômica "+ "\n");
            int input = dados.nextInt(); //Declara e inicia a variável input
            

            if (input == 1) {

                poltronas1[index1]=true;
                index1++;

                if (index1 == 5){
                    System.out.println("A Primeira classe está cheia");
                    break;
                }

                boolean[] result = new boolean[10];  //resultant array of size first array and second array  
                System.arraycopy(poltronas1, 0, result, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, result, poltronas1.length,poltronasEconomicas.length);  
                
                System.out.println(Arrays.toString(result));    //prints the resultant array
                
                
                
                System.out.println("Poltrona escolhida: "+index1+"\n");
            }

            if (input ==2) {

            
                poltronasEconomicas[index2]=true;
                index2++;

                
                if (index2== 5){
                    System.out.println("A classe econômica está cheia");
                    System.out.println("Deseja comprar uma poltrara na classe 1?");
                    break;
                }

                boolean[] result2 = new boolean[10];  //resultant array of size first array and second array  
                System.arraycopy(poltronas1, 0, result2, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, result2, poltronas1.length,poltronasEconomicas.length);  
                
                System.out.println(Arrays.toString(result2));
            
                
                System.out.println("Poltrona escolhida: "+ (index2+poltransEco)+"\n");

                poltransEco--;

            }
           
        }
        dados.close();
        
    
        
    }//Fim do metódo main

}
//Fim da classe Poltronas
