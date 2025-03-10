import java.util.Scanner;

public class PalindromoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        
        palavra = palavra.toLowerCase();
        
       
        boolean isPalindromo = true;
        int length = palavra.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(length - i - 1)) {
                isPalindromo = false;
                break;
            }
        }
        
       
        if (isPalindromo) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        
        scanner.close();
    }
}
