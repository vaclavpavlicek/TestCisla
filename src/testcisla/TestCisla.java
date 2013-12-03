/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testcisla;

/**
 *
 * @author Venda
 */
public class TestCisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cislo = 0;
        
        cislo = 1 + (int) (100 * Math.random());    // Získá náhodné číslo od 0 do 100.
        
        if (cislo % 2 == 0){    //Testuje zda je proměná cislo sudá.
                                
            System.out.println("Dostali jste sudé číslo " + cislo); // Proměná cislo je sudá
        
                if (cislo < 50){
                
                    System .out .println("Číslo je menší než 50 a je sudé.");
                    
                }
            
        }else{
        
            System.out.println("Dostali jste liché číslo " + cislo);   // Proměná cislo je lichá
            
            if(cislo < 50){
                
                System.out.println("Číslo je menší než 50 a je liché " + cislo);
                
            }
            
        }
                       
    }
    
}