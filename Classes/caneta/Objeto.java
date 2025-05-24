package caneta;


public class Objeto {
    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta("Bic", "azul", 0.4f, 2);

        
        
        
        /* caneta1.setTampada(true);
        if (caneta1.getTampada()) {
            System.out.println("tampada");
        } else {
            System.out.println("destampada");
        }
        */

        caneta1.status();
        //caneta1.status();
        //caneta1.ponta = 1.2f; Erro porque o atributo está privado
        //caneta1.tampar(); Erro porque o método está privado
        //caneta1.cor = "verde";

    }
}
