import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        double numMax = Double.MIN_VALUE;
        double numMin = Double.MAX_VALUE;
        int cantNumeros, posicionMax = 0, posicionMin = 0;
        double num;

        System.out.print("Introduzca cuántos números se van analizar: ");
        cantNumeros = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= cantNumeros; i++) {
            System.out.print("Introduzca el número " + i + ": ");
            num = Double.parseDouble(input.nextLine());

            if (num > numMax) {
                numMax = num;
                posicionMax = i;                
            }

            if (num < numMin) {
                numMin = num;
                posicionMin = i;
            }
        }

        System.out.println("El número mayor es el " + numMax + " en la posición " + posicionMax);
        System.out.println("El número menor es el " + numMin + " en la posición " + posicionMin);

        input.close();        
    }    
}
