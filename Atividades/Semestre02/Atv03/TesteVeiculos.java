//declarando classe testeVeiculos
public class TesteVeiculos {
    public static void main(String[] args) {//inicializando main        
        //impressão de text
        System.out.println("Classe Carro"+"\n");
        //instanciando classe carro
        Carro carro = new Carro("Wayne Foundation", 2000, "Batmóvel", 2);
        //exibindo informações do carro
        System.out.println(carro.exibirDetalhes());
        
        //impressão de sting 
        System.out.println("================================================================");

        System.out.println("Classe Moto"+"\n");
        //instanciando classe Moto 
        Moto moto = new Moto("BMW", 2000, "Moto", 2);
        //exibindo informações do moto
        System.out.println(moto.exibirDetalhes());
        
        
    }//fim do metódo main
    
}//fim da classe
