//Classe UsaAnimais
/* IFPR - Campus Cascavel
Aluno: Pedro Miotto Mujica
Disciplina: Programação Orientada à Objetos
Professor: Nelson Bellincanta */ 

public class UsaAnimais {//Início da classe UsaAnimais
    public static void main(String args[]){//Definição do metódo main para execução das classes criadas
        //Definicao do objeto para testar os metódos das classe desenvolvidas
        //definição do objeto passaros da classe Passaros
        Passaros passaros = new Passaros("Gandalf's EAGLE", 500);
        //Definição do objeto cachorros para usar a classe cachorros
        Cachorros cachorros = new Cachorros("Doug", 30);

        //definindo cor
        passaros.setCor("Cinza");
        //Mostrando informações dos passaros
        passaros.ShowInfo();
        //Testando metódo emitir som
        passaros.emitirSom();
        //Testando metódo voar
        passaros.voar();
        //tESTANDO METÓDO CONSTRUIR NINHO
        passaros.construirNinho();
        System.out.println("================================================");
        //Definindo raça do cachorro
        cachorros.setRaca("Pincher");
        //mostrando informações
        cachorros.ShowInfo();
        //testando metódo emitir som
        cachorros.emitirSom();
        //Testando metódo mover
        cachorros.mover();
        //Testando metódo abanarRabo
        cachorros.abanarRabo();
    }//Fim do metódo main
    
}//Fim da classe
