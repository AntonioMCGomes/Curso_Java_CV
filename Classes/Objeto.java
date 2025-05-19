public class Objeto {
    public static void main(String[] args) {
        
        Caneta caneta1 = new Caneta();

        caneta1.status();
        //caneta1.ponta = 1.2f; Erro porque o atributo está privado
        //caneta1.tampar(); Erro porque o método está privado

    }
}
