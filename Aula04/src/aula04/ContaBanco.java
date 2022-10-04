package aula04;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Metodos Personalizados
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        
        
        
    }
    
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") { // conta corrente 
            //this.saldo = 50;
            this.setSaldo(50);
        } else if(t == "CP") { // conta poupança 
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada ainda tem dinheiro");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem debitos");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double v){ // valor
        if(this.status == true){
            //this.saldo = this.saldo +v;
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de "+this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada !");
        }
        
    }
    public void sacar(double v){ // valor
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
                
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada! ");
        }   
    }
    public void pagarMensal(){
        int v = 0; // variavel local
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por "+this.getDono());
        }else {
            System.out.println("Impossivel pagar uma conta fechada ");
        }
         
    }
    
    //Metodos Especiais

    public ContaBanco() {
        this.saldo = 0;
        this.status  = false;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
    
    
    
    
}
