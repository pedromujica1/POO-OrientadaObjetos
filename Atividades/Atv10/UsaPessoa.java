//Classe UsaPessoa
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class UsaPessoa {
    public static void main(String[] args){
        //define variaveis com as informações que vai ser atribuidas
        //nome a ser definido
        String name = "Bob Dylan";
        //idade a ser definido
        int age = 62;
        //altura a ser definido
        double height =1.60;
        
        //Instancia a classe para ser utilizada
        Pessoa pessoa1 = new Pessoa();
        //define o atributo nomePessoa com a variavel name declarada acima
        pessoa1.setNome(name);
        //define o atributo idadePesssoa com a variavel age declarada acima
        pessoa1.setIdadePessoa(age);
        //define o atributo alturaPessoa com a variavel height declarada acima
        pessoa1.setAlturaPessoa(height);

        //Retirando atributos por meio do get e armazenando valores definidos em variaveis
        String nomeMetodo = pessoa1.getNome(); 
        int idadeMetodo =  pessoa1.getIdadePessoa();
        double alturaMetodo = pessoa1.getAlturaPessoa();

        //Impressão dos atributos da classe Pessoa
        String display = "Nome da pessoa: "+nomeMetodo +"\n" + "Idade da pessoa: "+idadeMetodo+ "\n" + "Altura da pessoa: "+alturaMetodo+"\n";
        System.out.println(display);
    }
}