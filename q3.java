import java.util.Scanner;

public class FibonacciEInversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1, temp;
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
        
        System.out.println();
        
        
        System.out.print("Digite um número inteiro para inverter: ");
        int num = scanner.nextInt();
        int numInvertido = 0;
        
        while (num != 0) {
            int digito = num % 10;
            numInvertido = numInvertido * 10 + digito;
            num /= 10;
        }
        
        System.out.println("Número invertido: " + numInvertido);
        
        scanner.close();
    }
}