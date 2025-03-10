import java.util.Arrays;
import java.util.Scanner;

public class VerificadorAnagramas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine().toLowerCase();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine().toLowerCase();
        
        
        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
        
        scanner.close();
    }

    public static boolean saoAnagramas(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}
