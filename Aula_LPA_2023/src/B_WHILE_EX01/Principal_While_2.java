/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_WHILE_EX01;

import javax.swing.JOptionPane;

public class Principal_While_2 {
    public static void main (String[] args) {
        String letra;
        EX_WHILE_2 ex_while_2 = new EX_WHILE_2();
        
        letra = JOptionPane.showInputDialog("Informe a letra: ");
        
        while(letra.equalsIgnoreCase("x")){
            ex_while_2.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra");
        }
        JOptionPane.showMessageDialog(null, ex_while_2.mostra());
    }
}
