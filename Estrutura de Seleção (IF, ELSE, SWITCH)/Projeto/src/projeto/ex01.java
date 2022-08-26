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
public class ex01 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int choice1 = scan.nextInt();
        int maior = choice1;
        System.out.print("Digite outro numero: ");
        int choice2 = scan.nextInt();
        System.out.println("ESCOLHA 1 = " + choice1);
        System.out.println("ESCOLHA 2 = " + choice2);
        if(choice2 > maior){
            System.out.println("O numero " + choice2 + " é maior");
        }else{
            System.out.println("O numero " + choice1 + " é maior");
        }
    }
    
}
