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
public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] vogais = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};
        
        System.out.println("Digite uma letra: ");
        String choice = scan.next();
        
        for(int i = 0; i < vogais.length; i++){
            if(choice.equals(vogais[i])){
                System.out.println("é vogal");
                break;
            }else if(vogais[i].equals("U")){
                System.out.println("é consoante");
            }
        }
        
        
        
        
        
    }
}
