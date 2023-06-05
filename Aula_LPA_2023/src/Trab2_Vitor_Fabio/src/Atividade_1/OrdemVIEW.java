/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

import javax.swing.JOptionPane;

public class OrdemVIEW {
    public static void main (String args[]) {
         try {
             OrdemDTO ordemDTO = new OrdemDTO();
             OrdemCTR ordemCTR = new OrdemCTR();
             
             JOptionPane.showMessageDialog(null, "Insira os números em ordem crescente!");
             
             ordemDTO.setN1(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             ordemDTO.setN2(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             ordemDTO.setN3(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             ordemDTO.setN4(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número ALEATÓRIO:")
             ));
             
              JOptionPane.showMessageDialog(null, ordemCTR.imprimir(ordemDTO));
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro no sistema "+ e.getMessage());
         }
    }
}
