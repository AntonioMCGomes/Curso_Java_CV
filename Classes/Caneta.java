public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void rabiscar(){

        if (this.tampada == true) {
            System.out.println("Erro! É preciso destampar a caneta.");
        } else{
            System.out.println("Estou rabiscando...");
        }
    }

    public void status(){
        System.out.println("Uma caneta " + this.modelo + ";");
        System.out.println("De cor " + this.cor + ";");
        System.out.println("Cuja ponta é " + this.ponta + ";");
        System.out.println("Tem " + this.carga + " cargas;");
        System.out.println("Encontra-se " + this.tampada + ";");
    }

    private void tampar(){
        
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

}
