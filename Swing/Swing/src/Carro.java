


public class Carro {
    
    //Atributos (variáveis)
    String cor;
    String modelo;
    String ano;
    
    //Construtor
    public Carro(String modelo, String cor, String ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    //Método
    public void info() {
        System.out.println("O modelo " + modelo + " tem a cor " + cor + " e é do ano de " + ano + ".");
    }

    public static void main(String[] args) {

        //Objeto criado
        Carro carro1 = new Carro("Mengane", "preto", "2014");


        carro1.info();
    }
}
