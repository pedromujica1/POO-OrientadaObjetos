//Classe Passaros
/* IFPR - Campus Cascavel
Aluno: Pedro Miotto Mujica
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class Passaros extends Aves {
    //Atributo adiciona do tipo String cor
    private String cor;

    //Metódo adicional construirNinho()
    public void construirNinho(){
        System.out.println("CONSTRUINDO NINHO");

    }//FIM DO METÒDO

    //Metódo para definir um valor para o string cor
    public void setCor(String cor){//Início do metódo
        //Faz referência ao atributo cor e define com o valor passado como argumento no metódo
        this.cor = cor;
    }//Fim do metódo

    //Metódo para retirar o valor do atributo cor
    public String getCor(){//Início do metódo
        //Retorna o atributo cor
        return (cor);
    }//Fim do metódo

    //Classe construtorA para definir idade e nome
    public Passaros(String nome,int idade){
        //Usa o metódo setIdade para definir o valor da idade
        this.setIdade(idade);
        //Usa o metódo setNome para definir o valor do nome
        this.setNome(nome);
    }//FIM DO CONSTRUTOR

    //Metódo showInfo para mostrar informações
    public void ShowInfo(){
        
        //imprimindo nome
        System.out.println("NOME DA AVE: "+this.getNome());
        //IMPRIMINDO IDADE
        System.out.println("IDADE DA AVE: "+this.getIdade());
        //IMPRIME A COR DA AVE
        System.out.println("COR DA AVE: "+this.cor);
        

    }
}//fim da classe
