/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;
import java.util.Scanner;
/**
 *
 * @author Nosferas
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("F ou M: ");
            String choice = scan.next();
            String choiice = choice.toUpperCase();
            System.out.println("ESCOLHA: "+ choice);
            
            if(choiice == "F"){
                System.out.println(choice + " - Feminino");
                break;
            }else if(choiice == "M"){
                System.out.println(choice + " - Masculino");
                break;
            }else{
                System.out.println("Opção invalidade tente novamente");
            }
        }
        
    }
}
