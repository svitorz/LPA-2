/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_WHILE_EX02;

import javax.swing.JOptionPane;

public class Principal_While_Cada_Vogal {
    public static void main (String[] args){
         While_Cada_Vogal cada_vogal = new  While_Cada_Vogal();
           String letra;
         do{
             letra = JOptionPane.showInputDialog("Informe uma letra diferente de 0: ");
             cada_vogal.somar(letra);
         }while(!letra.equals("0"));
         JOptionPane.showMessageDialog(null, cada_vogal.mostrar());
    }
}
