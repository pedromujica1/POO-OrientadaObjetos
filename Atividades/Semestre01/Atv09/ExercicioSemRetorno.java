import java.util.Arrays;

public class ExercicioSemRetorno{
    //
    public int[] array1;

    //
    public void imprimirNumeros(int[] array1){
        
        if (array1.length <10) {
            System.out.println("Somente Arrays com 10 números");
        }//fim do if
        else if (array1.length == 10){
            String output = Arrays.toString(array1).replace("[", "").replace(",", " ").replace("]", "");
            
            System.out.println("Seus números: "+output);
        }//fim do else if
        
    }
    public void somaNumeros(int[] array1){
        int[] array2 = {2,4,6,8,10,12,14,16,18,20};
        int[] sumArray = new int[10];
        int sum = 0;

    
        for (int i = 0; i < array2.length; i++) {
            int newint = array1[i] + array2[i];
            sumArray[i] = newint;
            sum +=array1[i];
            
        }
        String str_result = Arrays.toString(sumArray).replace("]","").replace("[", "");
        String display = str_result.replace(",", " ");
    
        System.out.println("Array somada com outra Array: " + display);
        System.out.println("Resultado da soma dos elementos da Array inicial: "+sum);
    }
}

    

