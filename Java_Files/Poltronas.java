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
        Scanner respostaLotado= new Scanner(System.in);
        
        boolean verificador = true;

        int index1=0;
        int index2=0;

        while (verificador){
            int poltransEco = 5;
        

            System.out.println("Insira um número: "+ "\n"); //Imprime a mensagem de escolha.
            System.out.println("Digite 1 para atribuir assentos na primeira classe "+ "\n");
            System.out.println("Digite 2 para atribuir assentos na classe econômica "+ "\n");
            int input = dados.nextInt(); //Declara e inicia a variável input
            

            if (input ==1 && index1<5) {

                poltronas1[index1]=true;
                index1++;


                boolean[] result = new boolean[10];  //resultant array of size first array and second array  
                System.arraycopy(poltronas1, 0, result, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, result, poltronas1.length,poltronasEconomicas.length);  
                
            
                
                
                System.out.println("Você escolheu a classe primária");

                System.out.println("Poltrona escolhida: "+index1+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(result));
            }


            if (input == 1 && index1 >=5){
                System.out.println("A Primeira classe está cheia");
                System.out.println("Deseja comprar uma poltrara na classe 1? (s/n)");
                String resposta1 = respostaLotado.nextLine();
                System.out.println(resposta1);

                
                if (resposta1.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas.");
                    break;
                }
            }

            

            if (input ==2 && index2<5) {

            
                poltronasEconomicas[index2]=true;
                index2++;
                

                System.out.println(index2);


                boolean[] result2 = new boolean[10];  //resultant array of size first array and second array  
                System.arraycopy(poltronas1, 0, result2, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, result2, poltronas1.length,poltronasEconomicas.length);  
                
                System.out.println("Você escolheu a classe econômica");
            
                System.out.println("Poltrona escolhida: "+ (index2+poltransEco)+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(result2)+"\n");

                poltransEco--;

            }

            if(input ==2 && index2 >=5){
                System.out.println("A classe econômica está cheia");
                System.out.println("Deseja comprar uma poltrara na classe 1? (s/n)");
                String resposta = respostaLotado.nextLine();
                

                if (resposta.equals("s")){
                    
                    


                }
                if (resposta.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas".);
                    break;
                }
                

            }
            
           
        }
        dados.close();
        respostaLotado.close();
        
    }//Fim do metódo main
}//Fim da classe Poltronas
