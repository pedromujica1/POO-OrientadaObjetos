//Classe Aves
/* IFPR - Campus Cascavel
Aluno: Pedro Miotto Mujica
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 


//Superclasse mamíferos
public class Aves {
    //Definindo atributo privado nome do tipo String
    private String nome;

    //Definindo atributo privado idade do tipo string
    private int idade;
 
    //Metódo emitirSom da classe mamíferos
    public void emitirSom(){
        System.out.println("EMITINDO SOM");
 
    }//FIM DO METÓDO
     
    //Metódo voar() da classe Mamiferos 
    public void voar(){
        System.out.println("VOAAAAAANDO!!!!");
 
    }//FIM DO METÓDO

    //Construtor para inicializar valores padrões
    public Aves(){
        this.nome = "NOME DA AVE";//DEFININDO NOME
        this.idade = 0; //DEFININDO IDADE
    }//Fim do construtor
 
     
    //METÓDO para retirar a idade do Mamifero
    public int getIdade(){
        return (idade);//Retorna o atributo int idade
    }//Fim do metódo
 
    //Metódo para retirar o nome do Mamifero
    public String getNome(){
        return (nome);//Retorna o atributo String nome
    }//Fim do metódo
 
     //Metódo para definir do nome do mamífero
    public void setNome(String nome){
        //this referencia o atibuto nome dessa classe.
        //Define o atrubito nome com a String passada como parâmetro do metódo
        this.nome = nome;
    }//Fim do metódo

    //Metódo para definir idade da Ave
    public void setIdade(int idade){
        //Define o atrubito idade com o int passado como parâmetro do metódo
        this.idade = idade;
    }//Fim do metódo

    //Metódo showInfo para mostrar informações
    public void ShowInfo(){
        //IMPRIME O NOME
        System.out.println("NOME DA AVE: "+this.nome);
        //IMPRIME A IDADE
        System.out.println("IDADE DA AVE: "+this.idade);
    }//FIM DO METÓDO
 
}
