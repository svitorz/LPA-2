/*
Um funcionario recebe um salário fixo mais 4% de comissão sobre as vendas 
Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas.
Calcule e mostre a comissão e o salário final do funcionário. 
*/

package IntroducaoEX04;

import javax.swing.JOptionPane;

public class PrincipalSalario_Vendas {
    public static void main (String[] args) {
        Salario_Vendas salario_vendas = new Salario_Vendas();
        
        double salario, vendas;
        
        salario = Double.parseDouble(
        JOptionPane.showInputDialog (
            "Informe o salario do funcionario:"));
        
        vendas = Double.parseDouble(
        JOptionPane.showInputDialog(
        "Informe o valor de vendas do funcionario: "));
        
        JOptionPane.showMessageDialog(null, salario_vendas.calcularSalvendas(salario,vendas));
    }

                }//Fecha classe
