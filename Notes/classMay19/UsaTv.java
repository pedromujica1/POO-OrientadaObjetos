public class UsaTv {
    public static void main(String[] args){
        Tv tv1 = new Tv();

        tv1.canal = 150;
        tv1.volume = 3;
        tv1.aumentarVolume();
        tv1.aumentarVolume();;
        tv1.trocarCanal(10);
        tv1.mostrar();
    }
    
}
