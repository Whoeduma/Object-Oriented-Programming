/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0304;

public class conta {
    public String nome;
    public String conta;
    public String agencia;
    public Double saldo;
    
    
    
    //sobrecarga
    public conta(){
    
    }
    
    //definir metodo construtor
    public conta(double saldo){
        if(saldo >= 10){
        this.saldo = saldo;
        } else {
            System.out.println("Deposite 10,00 para criar a conta");
        }
        
    }
    
    public conta(String nome, String conta, String agencia, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
       
        if(saldo >= 10){
        this.saldo = saldo;
        } else {
            System.out.println("Deposite 10,00 para criar a conta");
        }
                
    
    }
    
  
    
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getNome(){
        return nome;
        
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    
    public String getConta(){
        return conta;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return agencia;
    }

    
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
           System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Saldo insuficente");
        }

    }
}
