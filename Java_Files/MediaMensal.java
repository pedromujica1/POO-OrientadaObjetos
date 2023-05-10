package ex05;

//Classe BalancoTrimestral
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class MediaMensal { //Declaração e inicialização da classe BalancoTrimestral
    public static void main(String[] args){//Declaração e inicialização do metódo main

        //Declaração da variável gastosJaneiro com o valor do gasto mensal
        double gastosJaneiro = 30000.0f; 
        //Declaração da variável gastosFevereiro com o valor do gasto mensal
        double gastosFevereiro = 33030.77f;
        //Declaração da variável gastosMarco com o valor do gasto mensal
        double gastosMarco = 23899.01f; 

        //Inicialização da variavel gastosTrimeste com a soma dos gastos dos outros meses.
        double gastosTrimeste = gastosJaneiro+gastosFevereiro+gastosMarco;

        //Declaração da variável mediaMensal
        double mediaMensal = gastosTrimeste/3;
        
        //Mostra na tela o resultado do gasto trimestal com o printf (Especifico para float)
        //Configurado para imprimir o resultado com somente duas casas decimais
        System.out.printf("O gasto trimestal foi de R$ %.2f\n", gastosTrimeste);

        //Mostra na tela o resultado da variável mediaMensal com os mesmos padrões anteriores.
        //\n pula a linha
        System.out.printf("Valor da média mensal = R$ %.2f\n", mediaMensal);

    }//Fim do metódo main
}//Fim da classe BalancoTrimestral
