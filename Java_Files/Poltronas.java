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

        boolean[] poltronasResultantes = new boolean[10];//Declaração e inicialização da array que vai receber a soma de poltronas1 e poltronasEconomicas  

        Scanner dados= new Scanner(System.in); //Inicia a classe Scanner para entrada de dados.
        Scanner respostaLotado= new Scanner(System.in); //Inicia a classe Scanner para entrada de outros dados.

        boolean verificador = true;//Variável para manter o while executando

        int index1=0;//Variável para contar quantas vezes assentos primarios foram compradas
        int index2=0;//Variável para contar quantas vezes assentos primarios foram comprados

        while (verificador){
            int contAssentosEconomica = 5;
            
            System.out.println("Insira um número: "+ "\n"); //Imprime a mensagem de escolha.
            System.out.println("Digite 1 para atribuir assentos na primeira classe "+ "\n");
            System.out.println("Digite 2 para atribuir assentos na classe econômica "+ "\n");
            int input = dados.nextInt(); //Declara e inicia a variável input
            

            if (input ==1 && index1<5) {

                poltronas1[index1]=true;//Define o elemento da array na posição do input com true
                index1++;//
                 
                System.arraycopy(poltronas1, 0, poltronasResultantes, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, poltronasResultantes, poltronas1.length,poltronasEconomicas.length);  
                        
                System.out.println("Você escolheu a classe primária");

                System.out.println("Poltrona atribuída: "+(index1)+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes));
            }


            else if (input == 1 && index1 >=5){
                System.out.println("A Primeira classe está cheia");
               
                System.out.println("Deseja comprar uma poltrona na classe econômica? (s/n)");
                String resposta1 = respostaLotado.nextLine();
                

                if (resposta1.equals("s") ){
                    
                    
                    for (int i = 0; i < poltronasResultantes.length;i++) {
                        int IndexRealClasse2 = (index2+contAssentosEconomica);
                        
                        
                        if (poltronasResultantes[IndexRealClasse2] == false){
                            System.out.println(IndexRealClasse2);

                            poltronasResultantes[IndexRealClasse2]=true;
                            
                            

                            boolean[] result = Arrays.copyOfRange(poltronasResultantes, 5, 10);

                            poltronasEconomicas=result;
                            


                            System.out.println("Você comprou a poltrona "+(IndexRealClasse2+1)+ " na classe econômica"+"\n");
                            System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                            
                            index2++;
                            contAssentosEconomica--;
                            
                            break;
                        }

                        else if(poltronasResultantes[IndexRealClasse2] == true)
                        {
                            
                            System.out.println("A poltrona "+(IndexRealClasse2+1)+ " já está comprada"+"\n");
                            break;
                        }
                        
                    }

                }
                

                
                if (resposta1.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas.");
                    break;
                }
            }

            if (input ==2 && index2<=4) {
                System.out.println("bruh: "+index2);

        
                poltronasEconomicas[index2]=true;
                index2++;
                
                System.arraycopy(poltronas1, 0, poltronasResultantes, 0, poltronas1.length);  
                System.arraycopy(poltronasEconomicas, 0, poltronasResultantes, poltronas1.length,poltronasEconomicas.length);  
                
                System.out.println("Você escolheu a classe econômica");

            
            
                System.out.println("Poltrona escolhida: "+ (index2+contAssentosEconomica)+"\n");

                System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");

                contAssentosEconomica--;

            }

            else if(input ==2 && index2>4){
                System.out.println("A classe econômica está cheia");
            
                System.out.println("Deseja comprar uma poltrona na classe 1? (s/n)");
                String resposta = respostaLotado.nextLine();
                

                if (resposta.equals("s")){

                    System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                    

                    for (int i = 0; i < poltronasResultantes.length;i++) {
                        if (poltronas1[index1] == false){
                            poltronas1[index1]=true;
                            poltronasResultantes[index1]=true;
                            index1++;

                            System.out.println("Você comprou a poltrona "+(index1)+ " na classe primária"+"\n");
                            System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                            break;
                        }
                        

                        else if(poltronasResultantes[index1] == true){
                            
                            System.out.println("A poltrona "+index1+ " já está comprada"+"\n");
                            break;
                        }
                    }
                    
                    
                }
                if (resposta.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas");
                    break;
                }
            }
            
        }
        dados.close();//Fechando objetos scanner
        respostaLotado.close();//Fechando objeto scanner 
    }//Fim do metódo main
}//Fim da classe Poltronas
