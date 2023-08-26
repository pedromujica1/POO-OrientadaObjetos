//declaracao da classe moto 
public class Moto extends Veiculo {

    //atributo cilindaradas 
    public int cilindradas;

    public Moto(String marca, int ano, String modelo,int cilindradas) {
        //metódo super para settar valores do construtor
        super(marca, ano, modelo);
        this.cilindradas = cilindradas;
    }
    //getter
    public int getCilindradas() {//inicio do metodo
        //retorna o atributo
        return cilindradas;
    }//fim do metodo
    //setter
    public void setCilindradas(int cilindradas) {//inicio do metodo
        //faz a referencia com o this pro atributo local e atribui a ele o valor do parametro
        this.cilindradas = cilindradas;
    }//fim do metodo

    //inidica que o metódo esta sendo sobrescrito
    @Override
    //metódo para imprimir funçoes do veiculo
    public String exibirDetalhes() {//inicio do metodo
        //string formatada para exibir informações com atributo adicional numero portas
        String display_dados = "Marca: "+this.marca+"\n"+"Ano: "+this.ano+"\n"+"Modelo: "+this.modelo+"\n"+"Cilindradas: "+this.cilindradas;
        //retorna string
        return display_dados;
    }//fim do metódo

}//fim da classe
