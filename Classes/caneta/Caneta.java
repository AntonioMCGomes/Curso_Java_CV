package caneta;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);       
        this.setCarga(carga);        
        
        this.rabiscar();
    }


    //Get e Set - Atributos - Inicio
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public int getCarga(){
       return this.carga;
    }

    public void setCarga(int carga){
        this.carga = carga;
    }

    public boolean getTampada(){
       return this.tampada;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    //Get e Set - Atributos - Fim

    public void rabiscar(){

        if (this.tampada == true) {
            System.out.println("Erro! É preciso destampar a caneta.");
        } else{
            System.out.println("Estou rabiscando...");
        }
    }

    public void status(){
        System.out.println("Uma caneta " + this.getModelo() + ";");
        System.out.println("De cor " + this.getCor() + ";");
        System.out.println("Cuja ponta é " + this.getPonta() + ";");
        System.out.println("Tem " + this.getCarga() + " cargas;");
        System.out.println("Encontra-se " + this.getTampada() + ";");
    }

    private void tampar(){

        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }



}
