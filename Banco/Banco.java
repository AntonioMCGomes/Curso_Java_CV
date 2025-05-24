
public class Banco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private boolean status = false;
    private double saldo = 0;

    //Construtor
    public Banco (){
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Get
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public boolean isStatus() {
        return status;
    }

    public double getSaldo() {
        return saldo;
    }
    //Fim
    
    //Set
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Fim

    //Métodos
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.isStatus());
    }

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equalsIgnoreCase("CC") ){
            this.setSaldo(50); 
        } else if (tipo.equalsIgnoreCase("CP")){
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){

        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em débido");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void pagarMensal(){

        int valor = 0;

        if (this.getTipo().equalsIgnoreCase("CC")){
            valor = 12;
        } else if (this.getTipo().equalsIgnoreCase("CP")){
            valor = 20;
        }

        if (this.isStatus()){
            if (this.getSaldo() >= 0){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente.");
            } 
        } else {
            System.out.println("Conta encerrada.");
        }




    }
    
    public void depositar(double deposito){

        if (isStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito feito na conta de " + this.getDono());
        } else {
            System.out.println("Conta encerrada.");
        }  
    }

    public void sacar(double valor){
        
        if (this.isStatus()){
            if (this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta encerrada");
        }
    }  
}

