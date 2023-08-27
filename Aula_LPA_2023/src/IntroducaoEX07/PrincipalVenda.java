/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroducaoEX07;

import javax.swing.JOptionPane;

public class PrincipalVenda {
    public static void main (String[] args) {
        Venda venda = new Venda();
        
        double precofa;
        double percimposto;
        double perluc;
        
        precofa = Double.parseDouble(
        JOptionPane.showInputDialog ("Insira o valor de fábrica: "));
                
       percimposto = Double.parseDouble(
       JOptionPane.showInputDialog("Insira o percentual de impostos: "));
               
               perluc = Double.parseDouble(
               JOptionPane.showInputDialog("Insira o percentual de lucro: "));
               
               JOptionPane.showMessageDialog(null, venda.calculoValor(precofa, perluc, percimposto));
    }
} 
