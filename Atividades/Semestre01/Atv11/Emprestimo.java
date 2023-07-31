//Classe Emprestimo
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class Emprestimo {//ínicio da classe Emprestimo
    //Variavel para armazenar total do emprestimo
    private double valorTotal;
    //Valor para representar a taxa de juros
    private double taxaJuros;
    //Valor para representar o número de parcelas
    private double parcelas;
    

    //metódo para definir os valores dos atributos de acordo com argumento dado
    public void setValores(double valorTotal,double taxaJuros, double parcelas){//inicio do metódo
        //Palavra reservada this que altera o valor referente á variavel global
        this.valorTotal = valorTotal;
        //define a taxa de juro
        this.taxaJuros = taxaJuros;
        //define o valor das parcelas
        this.parcelas = parcelas;
    }//fim do metódo

    public double getParcelas(){//metódo par pegar a quantidade de parcelas
        //retorna a variavel do tipo double parcelas
        return parcelas;
    }//fim do metódo

    //Varivel temporaria para armazenar valor das parcelas e transformando double em inteiro
    int temp= (int) parcelas;
    //variavel para armazenar a quantidade de parcelas já contadas
    int contParcelas = 0;

    //Metódo para retornar valor da próxima parcela a ser paga
    public String proximaParcela(){
        
        //Caso existem parcelas para calcular o valor do emprestimo, é feito o calculo do valor do Juros que é somado pela divisão do valortotal com o numero de parcelas
        if ((parcelas-contParcelas) >0) {//inicio do if
            
            //Calcula o valor real dos juros
            double valorJuros= valorTotal * (taxaJuros/100.0);
            //Soma o valor dos juros com o valor total divido pelo numero de parcelas
            double resultado = (valorTotal/parcelas) + valorJuros;
            //Armazena resultado em uma String e limitando o double para duas casas decimais
            String display = String.format("%.2f",resultado);
            //incremento na variavel contParcelas indicando que uma parcela ja foi contado
            contParcelas+=1;
            //retorna String display com o double formatado em String
            return display;
        }//fim do if
        else {//inicio do else
            return "-1";//Retorna string -1
        }//fim do else
           
    }//fim do metódo proximaParcela
    
}//Fim da classe Emprestimo
