/*
Faça um programa que receba o número de horas trabalhadas, o valor do salário
mínimo e o número de horas extras trabalhadas. Calcule e mostre o salário a receber
seguindo as regras a seguir:
a) A hora trabalhada vale 1/8 do salário mínimo;
b) A hora extra vale ¼ do salário mínimo;
c) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor
da hora trabalhada;
d) A quantia a receber pelas horas extras equivale ao número de horas extras
trabalhadas multiplicado pelo valor da hora extra;
e) O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas
extras.
 */
package Exercicio_4;

import javax.swing.JOptionPane;

public class PrincipalHorasT {
   public static void main (String[] args) {
       
        HorasT horast = new HorasT();
        
        double qnt_horas, salmin, qnt_extra;
        
        qnt_horas = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o número de horas trabalhadas: "));
        
        salmin = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o valor do salário mínimo:"));
        
        qnt_extra = Double.parseDouble(
        JOptionPane.showInputDialog("Insira o número de horas extras trabalhadas: "));
        
        
        JOptionPane.showMessageDialog(null, horast.calculoSalario(qnt_horas, salmin, qnt_extra));
    }
}
