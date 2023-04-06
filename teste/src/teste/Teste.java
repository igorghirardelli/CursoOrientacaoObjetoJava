/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author igora
 */
public class Teste {

    static void olaMetodos (){

              System.out.println ("Sou um novo método!");
              System.out.println("DSAHJKSDJKAHASDHJKASDHJK");
              System.out.println("DSLHJAASDSDHJKA");
       }
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        
        Integer A,B;
        
        System.out.println("Informe o primeiro numero");
         A = leitor.nextInt();
        
        System.out.println("Informe o segundo numero");
         B = leitor.nextInt();
         
         if(A == B){
             System.out.println("Sao iguais!");
         } else{
             System.out.println("Nao sao iguais!");
         }
    }
    
}
