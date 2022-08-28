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
            System.out.println("ESCOLHA: "+ choice + "...");
            
            if(choice.equals("F") || choice.equals("f")){
                System.out.println(choice + " - Feminino");
                break;
            }else if(choice.equals("M") || choice.equals("m")){
                System.out.println(choice + " - Masculino");
                break;
            }else{
                System.out.println("Opção invalidade tente novamente");
            }
        }
        
    }
}
