// Declaração da classe Veiculo
public class Veiculo {

    // Atributo marca da classe Veiculo
    public String marca;
    public int ano; // Atributo ano da classe Veiculo
    public String modelo; // Atributo modelo da classe Veiculo

    // Construtor da classe Veiculo
    public Veiculo(String marca, int ano, String modelo) {
        //Inicializa os atributos do objeto com os valores passados como parâmetros
        this.marca = marca; //inicializa atributo marca
        this.ano = ano; //inicializa atrubto ano
        this.modelo = modelo; //inicializa atributo modelo
    }

    // Método getter para obter o valor do atributo marca
    public String getMarca() {
        return marca;
    }

    // Método getter para obter o valor do atributo modelo
    public String getModelo() {
        return modelo;
    }

    // Método getter para obter o valor do atributo ano
    public int getAno() {
        return ano;
    }

    // Método setter para definir o valor do atributo marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método setter para definir o valor do atributo modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método setter para definir o valor do atributo ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    //metódo para imprimir funçoes do veiculo
    public String exibirDetalhes() {//inicio do metodo
        //string formatada para exibir informações
        String display_dados = "Marca: "+this.marca+"\n"+"Ano: "+this.ano+"\n"+"Modelo: "+this.modelo+"\n";
        //retorna string
        return display_dados;
    }//fim do metódo
}//fim da classe
