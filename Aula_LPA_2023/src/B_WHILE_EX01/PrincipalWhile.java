/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_WHILE_EX01;

import javax.swing.JOptionPane;

public class PrincipalWhile {
    public static void main(String[] args) {
        int numero=1;
        ExemploWhile exemplowhile = new ExemploWhile();
        
        while(numero !=0){
            numero = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número:"));
            exemplowhile.somar(numero);
        }
        JOptionPane.showMessageDialog(null, exemplowhile.mostra());
    }
            
}
