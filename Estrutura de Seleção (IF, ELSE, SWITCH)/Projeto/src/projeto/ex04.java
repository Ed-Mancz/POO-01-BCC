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
public class ex04 {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        int ano;
        
        System.out.print("Digite um ano: ");
        ano = choice.nextInt();
        
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto");
        }else if((ano % 4) == 0){
            System.out.println(ano + " é bissexto");
        }else{
            System.out.println(ano + " não é bissexto");
        }
    }
}
