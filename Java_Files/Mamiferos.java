//Classe Mamiferos
/* IFPR - Campus Cascavel
Aluno: Pedro Miotto Mujica
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

//Superclass Mamíferos
public class Mamiferos {
    //Definindo atributo privado nome do tipo String
    private String nome;
    //Definindo atributo privado idade do tipo string
    private int idade;

    //Metódo emitirSom da classe mamíferos
    public void emitirSom(){
        System.out.println("EMITINDO SOM!!!");

    }//FIM DO METÓDO
    
    //Metódo mover() da classe Mamiferos 
    public void mover(){
        System.out.println("MOVENDO!!!!");

    }//FIM DO METÓDO

    //Construtor da classe para definir valores padrões
    public Mamiferos(){
        this.nome = "NOME DO MAMÍFERO";
        this.idade = 0;
    }//Fim do construtor

    
    //Construtor para retirar a idade do Mamifero
    public int getIdade(){
		return (idade);//Retorna o atributo int idade
	}//Fim do metódo

     //Construtor para retirar o nome do Mamifero
    public String getNome(){
		return (nome);//Retorna o atributo String nome
	}//Fim do metódo

    //Construtor para definir do nome do mamífero
    public void setNome(String nome){
		//this referencia o atibuto nome dessa classe.
        //Define o atrubito nome com a String passada como parâmetro do metódo
        this.nome = nome;
	}//Fim dot metódo
    public void setIdade(int idade){
        //Define o atrubito idade com o int passado como parâmetro do metódo
        this.idade = idade;
    }//Fim do metódo

    //Metódo showInfo para mostrar informações
    public void ShowInfo(){
        //IMPRIME O NOME
        System.out.println("NOME DO MAMÍFERO: "+this.nome);
        //IMPRIME A IDADE
        System.out.println("IDADE DO MAMÍFERO: "+this.idade);

    }//FIM DO METÒDO
}
