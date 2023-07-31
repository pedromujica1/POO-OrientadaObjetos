//Classe Pessoa
/* IFPR - Campus Cascavel
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class Pessoa { //Início da classe Pessoa
    //Declaração do atributo nomePessoa privado do tipo string
    private String nomePessoa;
    //Declaração do atributo idadePessoa privado do tipo int
    private int idadePessoa;
    //Declaração do atributo alturaPessoa privado do tipo double
    private double alturaPessoa;

    //Metódo para acessar o atributo nomePessoa
    public String getNome(){//ínicio do metódo
        //Retorna o atributo
        return nomePessoa;
    }//Fim do metódo
    
    //Metódo para alterar o valor do atributo nomePessoa
    public void setNome(String nomePessoa){
        //Palavra reservada this que altera o valor referente á variavel global
        this.nomePessoa = nomePessoa;
    }//Fim do metódo

    //Metódo para acessar o atributo idadePessoa
    public int getIdadePessoa(){//ínicio do metódo
        //Retorna o atributo
        return idadePessoa;
    }//Fim do metódo
    
    //Metódo para alterar o valor do atributo idadePessoa
    public void setIdadePessoa(int idadePessoa){
        //Palavra reservada this que altera o valor referente á variavel global
        this.idadePessoa = idadePessoa;
    }//Fim do metódo

    //Metódo para acessar o valor do atributo AlturaPessoa
    public double getAlturaPessoa(){//Início do metódo
        //Retorna o atributo
        return alturaPessoa;
    }//Fim do metódo

    //metódo para alterar o valor do atributo Altura Pessoa
    public void setAlturaPessoa(double alturaPessoa){
        //Palavra reservada this que altera o valor referente á variavel global
        this.alturaPessoa = alturaPessoa;
    }//Fim do metódo

}//FIM da classe Pessoa
