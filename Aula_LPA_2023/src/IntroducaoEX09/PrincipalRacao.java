/*
    Pedro comprou um saco de ração com peso em quilos. Pedro possui dois gatos para os quais 
    fornece a quantidade de ração em gramas.

    Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada gato.

    calcule e mostre quanto restará de ração em quilos no saco após 5 dias
*/
package IntroducaoEX09;

import javax.swing.JOptionPane;

public class PrincipalRacao {
    public static void main (String[] args) {
        Racao racao = new Racao();
        
        double peso;
        double quantum;
        double quantdois;
        
        peso = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o peso em quilos do saco de ração: "));
        
        quantum = Double.parseDouble(
        JOptionPane.showInputDialog ("Insira a quantidade de ração fornecida para o gato 1: "));

        quantdois = Double.parseDouble(
        JOptionPane.showInputDialog ("Insira a quantidade de ração fornecida para o gato 2: "));
        
        JOptionPane.showMessageDialog(null, racao.calculoRacao(peso,quantum, quantdois));
               
    }
}
