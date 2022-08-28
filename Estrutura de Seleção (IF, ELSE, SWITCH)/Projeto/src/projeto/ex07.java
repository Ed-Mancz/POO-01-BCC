/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Nosferas
 */
public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[3];
        
        System.out.println("Digite um numero: ");
        arr[0] = scan.nextInt();
        System.out.println("Digite um numero: ");
        arr[1] = scan.nextInt();
        System.out.println("Digite um numero: ");
        arr[2] = scan.nextInt();
       
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
    }
}
