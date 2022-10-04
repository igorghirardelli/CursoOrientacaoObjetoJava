
package gettersetterconstrutor;

public class GetterSetterConstrutor {
   
    public static void main(String[] args) {
      //Caneta c1  = new Caneta();
      //c1.setModelo("BIC");
      //c1.modelo = "Bic";
      
      //c1.SetPonta(0.5);
      //c1.ponta = 0.5;
      //c1.status();
      //  System.out.println("Tenho uma caneta "+c1.getModelo()+ " de Ponta "+c1.getPonta());
       
      
      
      
      
     Caneta c1  = new Caneta("GRIS", 5.0, "ROSAPUNK");
      c1.status();
     
        System.out.println("");
      
      Caneta c2 = new Caneta("PUNKBLACK", 12.0, "PRETA");
      c2.status();
         
    }
    
}
