# Notebook Atividade 07 - Atv07

Elabore uma classe que receba 5 notas de alunos por meio de showInputDialog, armazene essas notas em um array de cinco elementos, apresente em tela as cinco notas em ordem decrescente (da maior para a menor) e a média aritmética das notas.

# Para a resolução da atividade os seguintes passos foram realizados:

* Importar a biblioteca javax.swing.JOptionPane.
* Importar a biblioteca java.util.Arrays.
* Declarar array do tipo Float de tamanho 5 para receber as notas.
* Criar Strings para armazenar os dados da Array (arrayOriginal e arrayNova), para depois exibir no JOptionPane.
* Declarar float sumNotas para receber os elementos do array.
* Fazer um loop while para entrada de dados.
* Transformar elementos da array em números negativos.
* Usar o metódo .sort() para ordenar os números negativos.
* Fazer um loop for para transformar os números negativos em positivos, além de armazenar resultado na String arrayNova.
* No mesmo loop usar a variável sumNotas para somar todos os valores da Array.
* Ao final exibir as respectivas Strings e dividir a variável sumNotas por 5.


```java
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

```
