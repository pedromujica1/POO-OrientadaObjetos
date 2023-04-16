## Notebook Atividade 04 - Atv04

# Atividade
Objetivo: Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do
primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo os seguintes passos:
Para a resolução da atividade os seguintes passos foram realizados.

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
        
        //Mostra na tela o resultado do gasto trimestal com o printf (Especifico para float)
        //Configurado para imprimir o resultado com somente duas casas decimais
        System.out.printf("O gasto trimestal foi de R$ %.2f\n", gastosTrimeste);
    }//Fim do metódo main
    
}//Fim da classe BalancoTrimestral
```