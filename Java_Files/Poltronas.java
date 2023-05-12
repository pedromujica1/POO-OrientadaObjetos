//Classe Poltronas
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */

import java.util.Arrays;//Importa a biblioteca Arrays

import java.util.Scanner; //Importa a classe Scanner.



public class Poltronas {//Início da classe Poltronas
    public static void main(String[]args){//Declaração e inicialização do metódo main

        boolean[] poltronas1 = {false,false,false,false,false};//declaração e inicialização da array com os assentos da classe primária

        boolean[] poltronasEconomicas = {false,false,false,false,false};//declaração e inicialização da array com os assentos da classe economica

        boolean[] poltronasResultantes = new boolean[10];  

        Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados.
        Scanner respostaLotado= new Scanner(System.in); //Inicia a classe Scanner para entrada de outros dados.

        Scanner novosAssentos= new Scanner(System.in);//Inicia a classe Scanner para entrada de outros dados.
        
        boolean verificador = true;//

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


                 
                System.arraycopy(poltronas1, 0, poltronasResultantes, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, poltronasResultantes, poltronas1.length,poltronasEconomicas.length);  
                
            
                
                
                System.out.println("Você escolheu a classe primária");

                System.out.println("Poltrona escolhida: "+index1+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes));
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
                
                System.arraycopy(poltronas1, 0, poltronasResultantes, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, poltronasResultantes, poltronas1.length,poltronasEconomicas.length);  
                
                System.out.println("Você escolheu a classe econômica");
            
                System.out.println("Poltrona escolhida: "+ (index2+poltransEco)+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");

                poltransEco--;

            }

            if(input ==2 && index2 >=5){
                System.out.println("A classe econômica está cheia");
                System.out.println("Deseja comprar uma poltrara na classe 1? (s/n)");
                String resposta = respostaLotado.nextLine();
                

                if (resposta.equals("s")){

                    System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                    

                    System.out.println("Insira o número do assento da classe econômica que deseja ocupar? (1/5)" +"\n");
                    int assentoClasse1 = novosAssentos.nextInt();

                    for (int i = 0; i < poltronasResultantes.length;i++) {
                        if (poltronasResultantes[assentoClasse1-1] == true){
                            System.out.println("A poltrona "+assentoClasse1+ " já está comprada"+"\n");
                            break;
                        }
                        else {
                            poltronasResultantes[assentoClasse1-1]=true;
                        }
                        
                    }
                    System.out.println("Você comprou a poltrona "+assentoClasse1+ " na classe primária"+"\n");
                    System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                    break;
        
                }
                if (resposta.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas");
                    break;
                }
                

            }
            
           
        }
        dados.close();
        respostaLotado.close();
        novosAssentos.close();
        
    }//Fim do metódo main
}//Fim da classe Poltronas
