//Classe Cachorros
/* IFPR - Campus Cascavel
Aluno: Pedro Miotto Mujica
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 


public class Cachorros extends Mamiferos {
    //Atributo adicional do tipo String Raça
    private String raca;

    //Metódo adicional abanar rabo
    public void abanarRabo(){
        System.out.println("ABANANDO O RABO!");

    }//Fim do meódo

    //Classe construtora para definir valores da idade e nome
    public Cachorros(String nome, int idade){//Inicio da classe construtora
        //Usa o metódo setIdade para definir o valor da idade
        this.setIdade(idade);
        //Usa o metódo setNome para definir o valor do nome
        this.setNome(nome);
    }//Fim da classe construtora

   

    //metódo para definir a raça
    public void setRaca(String raca) {
		//Referencia o atributo raça da classe e define com o valor do parametro do metódo
        this.raca = raca;
	}
    //metódo para pegar valor da raça
	public String getRaca(){
		//Retorna a string raca
        return (raca);
	}

    //Metódo showInfo para mostrar informações
    public void ShowInfo(){
        //IMPRIME A RAÇA DO MAMIFERO
        System.out.println("RAÇA DO MAMÍFERO: "+this.raca);
        System.out.println("NOME DO MAMIFERO: "+this.getNome());
        System.out.println("IDADE DO MAMIFERO: "+this.getIdade());
    
    }//fim do metódo
}
    

