//CAAC
package atividades;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
    int tam = tcl.nextInt();

    long vet[] = new long[tam];
        for (int i = 0; i < vet.length; i++) {
           if (i < 2){
               vet[i] = i;
           }else{
               vet[i] = vet[i - 1] + vet[i - 2];
           }
            System.out.println(vet[i]);
            
        }
        System.out.println("Digite o valor a ser procurado");
        int nume = tcl.nextInt();
        for (int j = 0; j < vet.length; j++) {
            if(nume == j) {
               System.out.println("Numero encontrado " + j +"° :"+vet[j] ) ;
                
            }
    
        }
    }
}  
