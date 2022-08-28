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
public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite outra nota: ");
        float n2 = scan.nextFloat();
        
        if(((n1 + n2) / 2) >= 7){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
        }
    }
}
