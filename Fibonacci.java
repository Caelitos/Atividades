
package atividades;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Fibonacci {
  
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
  
  
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
     Fibonacci obj = new Fibonacci();
     long vetor[] = new long[30];
     
        for (int i = 0; i < 30; i++) {
            
           //System.out.println("(" + i + "):" + obj.fibo(i));
            
            long aux = obj.fibo(i);
            vetor[i] = aux;
        }
        
        boolean resul = false;
        System.out.println("Digite o valor a ser procurado");
        int nume = tcl.nextInt();
        System.out.println("");
        for (int j = 0; j < vetor.length; j++) {
            if(nume == vetor[j]) {
               System.out.println("Numero encontrado na posição: " + (j + 1 ) + "°");
               System.out.println("O Numero encontrado nessa posição foi: " + vetor[j]);
                resul = true;
                break;
            }else{
                resul = false;                
            }
        }
        if(resul == false){
            System.out.println("Valor não encontrado");
        }
    }
}
  