

import java.util.Scanner;

public class BuscaBinaria {

    public static int buscaBinaria (int[] array, int valor) {
        
        int inicio = 0;
        int fim = array.length -1;

        while( inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if(array[meio] == valor) {
                return meio;
            } else if (array[meio] < valor) {
                inicio = meio + 1; 
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            

            int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

            
            System.out.print("Informe o valor a ser buscado: ");
            int escolha = scanner.nextInt();

            int resultado = buscaBinaria(array, escolha);

            if (resultado == -1){
                System.out.println("O valor " + escolha + " não foi encontrado.");
            } else {
                System.out.println("O número " + escolha + " está no índice " + resultado);  
            }

            System.out.println("Para encerrar, digite 'sair'");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("sair")) {
                break; 
            }     

        }
        scanner.close();
    }    
}   









