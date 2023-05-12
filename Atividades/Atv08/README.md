# Notebook Atividade 08 - Atv08

Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).
O sistema deve exibir as seguintes alternativas: 

- Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica .  Se o usuário digitar 1, o sistema deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, o sistema deve atribuir um assento na classe econômica (poltronas 6 a 10). 

- O sistema deve ainda exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

- Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 

- Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. 

- À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

- O sistema nunca deve atribuir uma poltrona que já foi reservada. 

- Quando a classe econômica estiver lotada, o sistema deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "O próximo voo parte em 3 horas".

# Para a resolução da atividade os seguintes passos foram realizados:

* Importar a classe Scanner.



```
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
        
        boolean verificador = true;//Variável para manter o while executando

        int index1=0;//Variável para contar quantas vezes assentos primarios foram compradas
        int index2=0;//Variável para contar quantas vezes assentos primarios foram comprados

        while (verificador){
            int poltransEco = 5;
        

            System.out.println("Insira um número: "+ "\n"); //Imprime a mensagem de escolha.
            System.out.println("Digite 1 para atribuir assentos na primeira classe "+ "\n");
            System.out.println("Digite 2 para atribuir assentos na classe econômica "+ "\n");
            int input = dados.nextInt(); //Declara e inicia a variável input
            

            if (input ==1 && index1<5) {

                System.out.println("Escolha uma poltrana da classe primária (1/5)"+ "\n"); //Mensagem de impressão do comando
                int PoltronaInput = dados.nextInt(); //Declara e inicia a variável para receber o input do número de poltrona
                if(PoltronaInput >5){//Início do if caso o usuário digite um número maior que 5
                    System.out.println("Somente assentos entre 1 e 5.");//imprime mensagem
                }//fim do if
                
                poltronas1[PoltronaInput-1]=true;//Define o elemento da array na posição do input com true
                index1++;//


                 
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

                if (resposta1.equals("s")){
                    System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                    

                    System.out.println("Insira o número do assento da classe econômica que deseja ocupar? (6/10)" +"\n");
                    int assentoClasse2 = novosAssentos.nextInt();

                    for (int i = 0; i < poltronasResultantes.length;i++) {
                        if (poltronasResultantes[assentoClasse2-1] == true){
                            System.out.println("A poltrona "+assentoClasse2+ " já está comprada"+"\n");
                            break;
                        }
                        else {
                            poltronasResultantes[assentoClasse2-1]=true;
                        }
                        
                    }
                    System.out.println("Você comprou a poltrona "+assentoClasse2+ " na classe primária"+"\n");
                    System.out.println("Gráfico de poltronas: "+Arrays.toString(poltronasResultantes)+"\n");
                    break;

                }

                
                if (resposta1.equals("n")){
                    System.out.println("O próximo voo parte em 3 horas.");
                    break;
                }
            }

            

            if (input ==2 && index2<5) {

            
                System.out.println("Escolha uma poltrana da classe econômica (6/10)"+ "\n");
                int PoltronaInput = dados.nextInt(); //Declara e inicia a variável input
                if(PoltronaInput >5){
                    System.out.println("Somente assentos entre 1 e 5.");
                }
                poltronasEconomicas[PoltronaInput-1]=true;
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
                    

                    System.out.println("Insira o número do assento da classe primária que deseja ocupar? (1/5)" +"\n");
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
        dados.close();//Fechando objetos scanner
        respostaLotado.close();//Fechando objeto scanner 
        novosAssentos.close();//Fechando objeto scanner
        
    }//Fim do metódo main
}//Fim da classe Poltronas



```