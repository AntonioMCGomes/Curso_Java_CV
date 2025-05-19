import java.util.Scanner;

import java.util.Scanner;

public class LoopDuasEntradas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Bloco executável
            System.out.println("Executando ação dentro do loop...");
            
            System.out.print("Digite a primeira entrada (ou 'sair' para encerrar): ");
            String entrada1 = scanner.nextLine();
            
            if (entrada1.equalsIgnoreCase("sair")) {
                break; // Sai do loop se a primeira entrada for "sair"
            }

            System.out.print("Digite a segunda entrada (ou 'sair' para encerrar): ");
            String entrada2 = scanner.nextLine();
            
            if (entrada2.equalsIgnoreCase("sair")) {
                break; // Sai do loop se a segunda entrada for "sair"
            }

            System.out.println("Você digitou: " + entrada1 + " e " + entrada2);
        }

        System.out.println("Loop encerrado.");
        scanner.close();
    }
}