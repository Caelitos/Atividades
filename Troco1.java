
package atividades;

import java.util.Scanner;

public class Troco1 {
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double vet[] = new double[12];
        
        vet[0] = 0.01;
        vet[1] = 0.05; 
        vet[2] = 0.10;
        vet[3] = 0.25;
        vet[4] = 0.50;  
        vet[5] = 1;
        vet[6] = 2;  
        vet[7] = 5; 
        vet[8] = 10;  
        vet[9] = 20; 
        vet[10] = 50;  
        vet[11] = 100;
        
        System.out.println("Digite o Valor da compra: R$:");
        int compra = tcl.nextInt();
        System.out.println("Digite o valor pago: R$:");
        int pago = tcl.nextInt();
        
        if (compra < pago){
            double aux = (pago - compra);
            for (int i = 11; i >= 0 ; i--) {
                if (aux >= vet[i]) {
                    aux = aux - vet[i];
                    System.out.println("Uma nota de R$:  " + vet[i]);
                }
            }
        }else if((compra - pago) == 0){
            System.out.println("Não tem troco");
        }else{
            System.out.println("Ta faltando dinhero meu fi");
        }
        
    }
}
