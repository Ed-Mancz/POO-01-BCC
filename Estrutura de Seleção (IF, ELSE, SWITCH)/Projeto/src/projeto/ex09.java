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
public class ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Altura: ");
        float altura = scan.nextFloat();
        System.out.println("Peso: ");
        float peso = scan.nextFloat();
        System.out.println("Sexo (F/M: ");
        String sexo = scan.next();
        sexo.toLowerCase();
        
        while(true){
            if(sexo.equals("f")){
                float pesoIdeal = (62 * altura) - 44.7f;
                
                System.out.println("Altura: " + altura + "\nPeso: " + peso + "\nSexo: " + sexo.toUpperCase());
            
                System.out.println("Peso ideal: " + pesoIdeal);
                
                if(peso > pesoIdeal){
                    System.out.println("Esta acima do peso ideal");
                }else{
                    System.out.println("Esta abaixo do peso ideal");
                }
                
                break;
            }else if(sexo.equals("m")){
                float pesoIdeal = (72.7f * altura) - 52f;
                
                System.out.println("Altura: " + altura + "\nPeso: " + peso + "\nSexo: " + sexo.toUpperCase());
                
                System.out.println("Peso ideal: " + pesoIdeal);
                
                if(peso > pesoIdeal){
                    System.out.println("Esta acima do peso ideal");
                }else{
                    System.out.println("Esta abaixo do peso ideal");
                }
                
                break;
            }else{
                System.out.println("Opção invalida, tente novamente");
            }
        }
        
        
                
    }
}
