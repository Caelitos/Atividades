
package atividades;

import java.util.Scanner;

/**
 * @author Carlos
 */
public class Atividades {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor:");

        int num = tcl.nextInt();
        double num2 = num;

        if ((num2/num2)==(num/num)){
            if(num2/2 != num/2 || num==2){

                System.out.println("O valor informado é primo!");

            } else {

                System.out.println("O valor informado não é primo!");

            }

        } else {

            System.out.println("O valor informado não é prim!");

        }

    }
    
}
