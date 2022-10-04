
package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.carga  = 100;
        c1.modelo = "BIC";
        c1.tampar(); // tampada a caneta não pode rabiscar
        
        
        c1.status();
        c1.rabiscar();
        
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.ponta = 1.0f;
        c2.carga = 60;
        c2.modelo = "hostnet";
        c2.destampar(); // destampada a caneta pode rabiscar
        
        c2.status();
        c2.rabiscar(); // tampar == true else " error não pode rabiscar" else " estou rabiscando "
        
        
    }
    
}
