/*
Faça um programa que receba dois números, calcule e mostre a divisão do primeiro
número pelo segundo. Informe ao usuário que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
 */
package Exercicio_2;

import javax.swing.JOptionPane;

public class PrincipalDivisao {
    public static void main (String[] args) {
        Divisao divisao = new Divisao();
        
        double n1;
        double n2;
        double resultado;
        
        n1 = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o primeiro valor:"));
        
        n2 = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o segundo valor: (Não pode ser 0!)"));
          
        JOptionPane.showMessageDialog(null, divisao.calculoDivisao(n1,n2));
                
    }
}
