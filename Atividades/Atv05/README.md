## Notebook Atividade 05 - Atv05

# Atividade
Objetivo: Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

* Importar a classe Scanner da biblioteca java.util.
* Usar o objeto dados que utiliza a classe Scanner para ler os dados.
* Usar o metódo nextInt() da classe Scanner para ler as variáveis arg1 e arg2 como inteiros.
* Fechar o objeto leitor com o metódo .close()
* Mostrar a soma de arg1 e arg2 com o metódo print()

```
//Classe BalancoTrimestral
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class BalancoTrimestral { //Declaração e inicialização da classe BalancoTrimestral
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

```