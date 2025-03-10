import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();
        
        
        if (frase.isEmpty()) {
            System.out.println("A frase contém 0 palavras.");
        } else {
            
            String[] palavras = frase.split("\\s+");
            System.out.println("A frase contém " + palavras.length + " palavras.");
        }
        
        scanner.close();
    }
}
