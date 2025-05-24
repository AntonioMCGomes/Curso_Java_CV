
public class Objeto {
    public static void main(String[] args) {

        Banco pessoa1 = new Banco();

        pessoa1.setNumConta(11111);
        pessoa1.setDono("Antonio");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(100);
        
        Banco pessoa2 = new Banco();

        pessoa2.setNumConta(22222);
        pessoa2.setDono("Rose");
        pessoa2.abrirConta("CP");
        pessoa2.depositar(300);
        pessoa2.sacar(50);
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
}