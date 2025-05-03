import java.util.Scanner;

public class SomaD {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é: " + soma);

        scanner.close();
    }
}
