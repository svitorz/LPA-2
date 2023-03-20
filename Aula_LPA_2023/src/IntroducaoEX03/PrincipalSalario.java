/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroducaoEX03;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main (String[] agrs) {
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "O salario é: "
        + salario.calcularSalario(
        Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a porcetagem de aumento:"))
        ));
    }
}
