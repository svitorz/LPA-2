/*
Faça um programa que receba o custo de um espetaculo teatral e o 
preço do convite desse espetaculo. Esse programa deve calcular e mostrar a quantidade de
convites que devem ser vendiddos para que pelo menos o custo do espetaculo seja alcançado.
 */
package Introducao_EX11;

import javax.swing.JOptionPane;

public class PrincipalEspetaculo {
    public static void main (String[] args) {
        
        Espetaculo espetaculo = new Espetaculo();
        
        double custo;
        
        double preconv;
        
        custo = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o custo da peça teatral: "));
        
        preconv = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o valor do ingresso: "));
        
        JOptionPane.showMessageDialog(null, espetaculo.calculoEspetaculo(custo,preconv));
    }
}
