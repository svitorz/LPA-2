/*
Faça um programa que receba três números, calcule e mostre a multiplicação
desses números.

 */
package Exercicio_1;

import javax.swing.JOptionPane;

public class PrincipalMultiplicacao {
    public static void main (String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();
        
        double n1;
        double n2;
        double n3;
        double resultado = 0; 
        
        n1 = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o primeiro valor:"));
        
         n2 = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o segundo valor:"));
         
          n3 = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o terceiro valor:"));
          
          JOptionPane.showMessageDialog(null, multiplicacao.calculoMultiplicacao(n1,n2,n3,resultado));
    }
}
