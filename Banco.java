
package atividades;

import java.util.Scanner;

public class Banco {
   
    float saldo;
    double deposito;
    double saque;  
    Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        Banco objeto = new Banco();
        
        objeto.ClienteSaldo();
        objeto.inicializar();

    }
    public void ClienteSaldo(){
        System.out.println("Digite aqui o seu saldo: ");
        saldo = tcl.nextFloat();        
    }
    
    public void Caixa() {
        System.out.println("");
        System.out.println("BEM VINDO AO CAIXA ELETRONICO");
        System.out.println("");
        System.out.println("Digite:");
        System.out.println("");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Saldo");
        System.out.println("4 - Sair");
        System.out.println("");
      
    }
    
    public void saldo() {
        System.out.printf("Seu saldo é de: R$%.2f\n", saldo);
    }
    
    public void saque(){
        System.out.println("Digite o valor que deseja sacar");
        tcl = new Scanner(System.in);
        saque = (double) tcl.nextDouble();
        
        if(saldo >= saque){
            saldo -= saque;
            System.out.println("");
            System.out.printf("Seu saldo agora é de: R$ %.2f\n", saldo);
        }else{
            System.out.println("Saldo Insuficiente");
            System.out.printf("Seu saldo atual é de:R$ %.2f\n", saldo);
        }       
    }
 
    public void deposito(){
       System.out.println("");
       System.out.println("digite o valor a ser depositado");
       deposito = tcl.nextDouble();
       saldo += deposito;
       System.out.printf("Seu saldo agora é de: R$%.2f\n", saldo);
    }
 
    public void inicializar(){   
        while (true) {

            Caixa();

            int acao = tcl.nextInt();

            switch (acao) {
                case 1:
                    saque();
                    break;
                case 2:
                    deposito();
                    break;
                case 3:
                    saldo();
                    break;
                case 4:
                    System.out.println("OBRIGADO, VOLTE SEMPRE");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        
        
    
    }
}
