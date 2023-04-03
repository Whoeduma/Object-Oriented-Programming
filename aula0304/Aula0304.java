/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0304;

import java.util.Scanner;

/**
 *
 * @author eduarda.moreira
 */
public class Aula0304 {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       conta conta1 = new conta("Ana", "1234", "001", 1000.0);
       
       System.out.println("Digite o nome do cliente:");
       String nome = sc.nextLine();
       conta1.setNome(nome);
       
       System.out.println("Digite a conta: ");
       String conta = sc.nextLine();
       conta1.setConta(conta);
       
       System.out.println("Digite a agencia: ");
       String agencia = sc.nextLine();
       conta1.setAgencia(agencia);
       
       System.out.println(conta1.getNome());
       System.out.println(conta1.getConta());
       System.out.println(conta1.getAgencia());
       
       conta1.depositar(1000.0);
       System.out.println("Saldo atual: ");
       System.out.println(""+conta1.getSaldo());
       
       conta1.sacar(5000.0);
    
       
       System.out.println("Saldo atual: ");
       System.out.println(""+conta1.getSaldo());
    }

    
    
}
