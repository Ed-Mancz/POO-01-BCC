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
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int choice = scan.nextInt();
        if(choice > 0){
            System.out.println("O numero " + choice + " é positivo");
        }else if(choice == 0){
            System.out.println("O numero " + choice + " é zero");
        }else{
            System.out.println("O numero é negativo");
        }
    }
}
