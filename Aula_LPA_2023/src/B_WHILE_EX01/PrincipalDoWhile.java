/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_WHILE_EX01;

import javax.swing.JOptionPane;

public class PrincipalDoWhile {
        public static void main (String[] args) {
        String letra;
        EX_DOWHILE ex_dowhile = new EX_DOWHILE();
        
      do{
          numero = Integer.parseInt(
          JOptionPane.showInputDialog("Informe o número:"));
          ex_dowhile.somar(numero);
      }while(numero != 0);
      
      JoptionPane.showMessageDialog(null, ex_dowhile.mostra);
    }
}

