
import java.util.Random;


class Criador {

    Random gerador = new Random();

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Criador(String nome, int vida, int ataque, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    } 
    
    void atacar(){

        int dano = gerador.nextInt(ataque + 1);

        System.out.println( nome + " tem " + vida + " de vida");
        System.out.println( nome + " atacou. Inflingiu dano de " + dano + ". ");

    }
   
    void defender() {

        int bloqueio = gerador.nextInt(defesa + 1);

        System.out.println(nome + " defendeu. Usou " + bloqueio + " de defesa.");
    }

    void resultado(){

        int dano = gerador.nextInt(ataque + 1);
        int bloqueio = gerador.nextInt(defesa + 1);

        if (dano > bloqueio){
            System.out.println(nome + " venceu.");
        } else {
            System.out.println( nome + " perdeu.");
        }
    }

}
    
class Heroi extends Criador{

    public Heroi(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);

    }

}

class Vilao extends Criador{

    public Vilao(String nome, int vida, int ataque, int defesa){
        super(nome, vida, ataque, defesa);
            
    }

}

public class Personagem {
    
    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("Marcio", 100, 50, 30);

        Vilao vilao1 = new Vilao( "Juvencio", 100, 50, 30);

        heroi1.atacar();
        heroi1.defender();
        heroi1.resultado();

        vilao1.atacar();
        vilao1.defender();
        vilao1.resultado();


       
    }

}

        
    