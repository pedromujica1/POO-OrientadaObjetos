import java.util.Scanner;

public class CirculoArea 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        double resul = 3.14159 * (raio*raio);
        System.out.println(String.format("A=%.4f", resul));
    }

    
}
