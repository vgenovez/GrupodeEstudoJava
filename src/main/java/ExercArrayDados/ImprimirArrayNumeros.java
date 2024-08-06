package ExercArrayDados;
import java.util.Scanner;

//Exercicio Imprimir Array de Números
public class ImprimirArrayNumeros {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];
 
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }
 
        for (int i = 0; i < quantidade; i++) {
            System.out.println(numeros[i]);
        }
 
        scanner.close();
    }
}