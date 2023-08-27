/*
Faca um programa que receba o salario base de um funcionario 
calcule e mostre o salario a receber sabendo que esse funbcionario te, gratifica;ao de r$50,00
e paga imposto de 10% sobr eo salario base.
*/
package IntroducaoEX05;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main (String[] args) {
        Salario salario = new Salario(); 
        
        double sal;
        
        sal = Double.parseDouble (
        JOptionPane.showInputDialog ("Informe o salario do funcionario: "));
        
        JOptionPane.showMessageDialog(null, salario.calcularSalario(sal));
    }
}
