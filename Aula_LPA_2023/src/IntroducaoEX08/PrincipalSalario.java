/*
     Faça um programa que receba o número de horas trabalhadas e o valor do salário míninmo
    Calcule e mostre o sálario a receber seguindo as regras abaixo;
    a) a hora atrabalhada vale a metade do salario minimo
    b) o salario bruto equivale ao numero de horas trabalhadas multiplicadas
    pelo valor da hora trabalhada
    c) o imposto equivale a 3% do salario bruto
    d) o salario a receber equivale ao salario bruto menos imposto
 */
package IntroducaoEX08;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main (String[] args) {
        Salario salario= new Salario();
        
        double salariomin;
        double horastr;
        
        salariomin = Double.parseDouble(
        JOptionPane.showInputDialog ("Insira o valor do salário mínimo: "));
                
       horastr = Double.parseDouble(
       JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas: "));
               
       JOptionPane.showMessageDialog(null, salario.calculoValor(salariomin, horastr));
    }
} 
