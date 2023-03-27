/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class petShop {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String namePet = JOptionPane.showInputDialog("Informe o nome do Pet: ");
    JOptionPane.showMessageDialog(null, "O nome do Pet é: " + namePet);
    
    String racaPet = JOptionPane.showInputDialog("Informe a raça do Pet: ");
    JOptionPane.showMessageDialog(null,"A raça do pet é: " + racaPet);
    
    String agePet = JOptionPane.showInputDialog("Informe a idade do pet: ");
    int age = Integer.parseInt(agePet);
    JOptionPane.showMessageDialog(null,"A raça do pet é: " + agePet);
    
    System.out.println("Nome do pet informado: " + namePet
                    +"\nRaca do pet informada: " + racaPet
                    +"\nIdade do pet informada: " + agePet);
    
    }
}

