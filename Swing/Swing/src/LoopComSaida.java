import java.util.Scanner;

public class LoopComSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite 'sair' para encerrar: ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                break; // Sai do loop
            }
            
            System.out.println("Você digitou: " + entrada);
        }
        
        System.out.println("Loop encerrado.");
        scanner.close();
    }
}
