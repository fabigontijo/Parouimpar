/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par_impar_fabianaramos;
import java.util.Scanner;
/**
 *
 * @author gontijo
 */
public class Par_Impar_FabianaRamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Digite um número:");
        n = scan.nextInt();
        
        if(n%2==0){
            System.out.println("O numero é: Par");
        
        }
        else if(n%2==1){
            System.out.println("O número é: Impar");
        }
    }
    
} 
