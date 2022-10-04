
package aula02;

public class Caneta {
     String modelo;
     String cor;
     float ponta;
     int carga;
     boolean tampada;
    
    public void status(){ // metodo
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga); {
        
    }
        System.out.println("Esta tampada? "+this.tampada);
        
    }
     void rabiscar(){ // metodo
        if(this.tampada == true){
            System.out.println("ERRO, não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }
     void tampar(){// metodo
        this.tampada = true;
    }
    void destampar(){// metodo
        this.tampada = false;
    }
    
    
    
}
