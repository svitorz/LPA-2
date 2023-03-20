/*
Sabe-se que o quillowatt de energia custa um quinto do salario minimo. Faça um programa
que receba o valor do salário mínimo e a quantidade de quilowatt consumidas por uma residencia. calcule  e mostre:
A) o valor em reaus, de cada quilowatt
B)o valor em reais, a ser pago por residencia
C) o valor em reais a ser pago com desconto de 15%
 */

package Introducao_EX10;

import javax.swing.JOptionPane;

public class PrincipalEnergia {
    public static void main (String[] args) {
        Energia energia = new Energia();
        
        double salmin;
        double consumo;
        
        salmin = Double.parseDouble (
        JOptionPane.showInputDialog("Insira o valor do salário mínino: "));
        
        consumo = Double.parseDouble(
        JOptionPane.showInputDialog("Informe a quantidade de quilowatt consumida pela residencia: "));
        
        JOptionPane.showMessageDialog(null, energia.calculoEnergia(salmin, consumo));
    }
}
