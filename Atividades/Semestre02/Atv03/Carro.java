//declaracao da classe carro
public class Carro extends Veiculo{
    
    //atibuto numero portas
    public int numero_portas;
    
    //construtor
    public Carro(String marca, int ano, String modelo,int numero_portas) {
        //inicializa atributos do construtor pai 
        super(marca, ano, modelo);
        //inicializa atributo do carro somente
        this.numero_portas = numero_portas;
    }
    //getter
    public int getNumero_portas() {//inicio do metodo 
        return numero_portas;//retorna o atributo
    }//fim do metodo

    //setter
    public void setNumero_portas(int numero_portas) {//inicio do metodo
        this.numero_portas = numero_portas;//atribui o atributo com o valor do parametro
    }//fim do metodo

    //inidica que o metódo esta sendo sobrescrito
    @Override
    //metódo para imprimir funçoes do veiculo
    public String exibirDetalhes() {//inicio do metodo
        //string formatada para exibir informações com atributo adicional numero portas
        String display_dados = "Marca: "+this.marca+"\n"+"Ano: "+this.ano+"\n"+"Modelo: "+this.modelo+"\n"+"Número de portas: "+this.numero_portas;
        //retorna string
        return display_dados;
    }//fim do metódo
    
}//fim da classe Carro
