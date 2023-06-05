package Atividade_2;

import javax.swing.JOptionPane;

public class CrescVIEW {
    public static void main (String args[]){
    try {
             CrescDTO crescDTO = new CrescDTO();
             CrescCTR crescCTR = new CrescCTR();
             
             crescDTO.setN1(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             crescDTO.setN2(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             crescDTO.setN3(
             Integer.parseInt(JOptionPane.showInputDialog("Insira um número:")
             ));
             
             JOptionPane.showMessageDialog(null, crescCTR.imprimir(crescDTO));
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro no sistema "+ e.getMessage());
         }
    }
}
