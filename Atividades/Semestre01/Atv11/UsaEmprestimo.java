//Classe UsaEmprestimo
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class UsaEmprestimo {//inicio da classe
    public static void main(String[] args) {
        Emprestimo E1 = new Emprestimo();//classe emprestimo instanciada no objeto E1
        Emprestimo E2 = new Emprestimo();//CLASSE EMPRESTIMO instanciada no objeto E2;

        //definindo valorTotal,taxa de juros e numero de parcelas para o objeto E1
        E1.setValores(1000.0, 3.0, 5);
        //Definindo valorTotal,taxa de juro e número de parcelas para o objeto E2
        E2.setValores(2000, 10.0, 10);

        //retirando o atributo das parcelas E1
        double qtdadeParcelas1 = E1.getParcelas();
        //RETIRANDO O ATRIBUTO DAS PARCELAS E2
        double qtdadeParcelas2 = E2.getParcelas();

        //RETIRANDO O MAIOR VALOR DENTRE AS DUAS QUANTIDADES DE PARCELAS
        double maiorValor = Math.max(qtdadeParcelas1,qtdadeParcelas2);


        System.out.println("\t Início das parcelas");//IMPRESSÃO DE TEXTO;
        //LAÇO DE REPETIÇÃO EM QUE É PERCORRIDO O MAIOR VALOR E MOSTRADO OS VALORES DO METÓDO proximaParcela()
        for (int i = 0; i < maiorValor+1; i++) {//COMEÇO DO FOR
            //IMPRESSÃO DOS RESULTADO COM CARACTERE DE TABULAÇÃO PARA MELHOR VISIBILIDADE
            System.out.println("Empréstimo E1: "+E1.proximaParcela() +"\t Empréstimo E2: "+E2.proximaParcela() );
            
        }//FIM DO FOR
        
        System.out.println("\t FIM DAS PARCELAS!");//IMPRESSÃO DO TEXTO
    }
}//fim da classe
