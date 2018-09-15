//CAAC
package atividades;

import java.util.Scanner;


public class Fibonacci {
  
    
  
  
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);
        System.out.println("Digite até que posição quer pesquisar:");
        int tam = tcl.nextInt(); 
        long a = 1;
        long b = 0;
        long aux;
        
        long vetor[] = new long[tam];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = b;
            aux = a;
            a += b;
            b = aux;
            System.out.println(vetor[i]);
                    
        }
        
      
        System.out.println("Digite a posição da sequência");
        int nume = tcl.nextInt();
        System.out.println("");
        for (int j = 0; j < vetor.length; j++) {
            if(nume == ( j + 1 ) ) {
               System.out.println("Numero da posição: " + (j + 1) + "° é " + vetor[j]);

            }
        }
    }
}  
