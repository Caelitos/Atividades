
package atividades;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        while(true){
        double fatorial = 1;

    Scanner tcl = new Scanner (System.in);
    double valor1 = tcl.nextDouble();
    double valor2 = tcl.nextDouble();
    double saida1 = 0;
    double saida2 = 0;

    for( int i = 2; i <= valor1; i++ ){ 

    fatorial *= i;
    saida1 = fatorial;
    }
    for( int i = 2; i <= valor2; i++ ){ 
    fatorial *= i;
    saida2 = fatorial;

    }

        System.out.println(saida1+saida2);  

        }

    

}

}
