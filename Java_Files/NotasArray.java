//Classe NotasArray
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

import java.util.Arrays; //Importando biblioteca das Arrays

import javax.swing.JOptionPane; //Importando a classe do JOptionPane

public class NotasArray {//Início da classe NotasArray
    public static void main(String args[]){//Início do metódo main

        //Declaração Array tipo Double
        Float[] notas;
        //Declaração da array com tamanho de 5 posições
        notas = new Float[5];
        //Declaração da String para receber as notas
        String str_input; 
        //Declaração da variável sumNotas para capturar a soma das notas no loop for
        Float sumNotas=0f;
        //declaração da variável arrayOriginal para mostrar no JoptionPane
        String arrayOriginal="";
        //declaração da variável arrayNova para mostrar no JoptionPane
        String arrayNova="";


        //Variável para marcar as ocorrências do while loop
        int contador=0;
        while (contador <=4) {//While loop para executar 5 vezes o ShowInputDialog
             
            str_input = JOptionPane.showInputDialog("Insira a nota: ");//Comando para receber input
            notas[contador] = Float.parseFloat(str_input);//Coloca as notas na posição de acordo com a variavel contador que vai alterando de acordo com cada iteração do loop
            //ex: notas[0] = valor do primeiro float digitado
            //notas[1] = valor do segundo float digitado
            //Salva conteúdo da Array na string arrayOriginal
            arrayOriginal+=notas[contador] + ", ";
            contador++; //Realiza o incremento da variável contador
            
        }//Fim do loop while

        ///Imprime as notas em formato de array
        System.out.println("Array original: " + Arrays.asList(notas));

        //Loop for para transformar elementdos da array em números negativos
        for(int i=0;i<notas.length;i++) {//Início do loop for

            notas[i]=-notas[i];//Transforma elementos da array notas em valores negativos

        }//Fim do loop for
        
        Arrays.sort(notas); //Metódo para ordenar os números negativos da array

        //Loop for para transformar os números negativos array em positivos
        for(int i=0;i<notas.length;i++) {//Início do loop for
        
            notas[i]=notas[i]*-1; //Multiplica elementos da array por -1 para gerar os números positivos originais 
            sumNotas+=notas[i];//Recebe o valor da soma dos elementos da array
            //Salva conteúdo da Array na string arrayNova
            arrayNova+=notas[i] + ", ";

        }//Fim do loop for

        
        //Imprime na tela do terminal o resultado
        System.out.println("Array em ordem decrescente: " + Arrays.asList(notas));
        //Imprime na tela do terminala média
        System.out.println("MÉDIA ARITMÉTICA DA TURMA: "+sumNotas/5);

        //Mostra no JoptionPane os resultados obtidos
        JOptionPane.showMessageDialog(null,"Array original: "+arrayOriginal
        + "\n" +"Array decrescente: "+arrayNova+ "\n"+ "Média da turma: "+sumNotas/5+ "\n");
        
        

    }//Fim do metódo main
    
}//Fim da classe NotasArray
