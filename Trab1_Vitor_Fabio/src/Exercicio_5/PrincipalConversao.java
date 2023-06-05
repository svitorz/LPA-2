/*
Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa
que vai viajar possui. Essa pessoa vai passar por vários países e precisa converter seu
dinheiro em dólares, euro e libra esterlina. Sabe-se que a cotação do Dólar é
de R$ 5,25, do Euro é de R$ 5,66 e da Libra esterlina é de R$ 6,42. O programa deve
fazer as conversões e mostrá-las.
 */
package Exercicio_5;

import javax.swing.JOptionPane;

public class PrincipalConversao {
    public static void main (String[] args) {
        
        Conversao conversao = new Conversao(); 
        
        double valoreal;
        
        valoreal = Double.parseDouble(
        JOptionPane.showInputDialog("Insira a quantidade de dinheiro em REAL:"));
        
        JOptionPane.showMessageDialog(null, conversao.calculoConversao(valoreal));  
    }
}
