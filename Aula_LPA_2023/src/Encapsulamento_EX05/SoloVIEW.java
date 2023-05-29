package Encapsulamento_EX05;

import javax.swing.JOptionPane;

public class SoloVIEW {
    public static void main (String args[]) {
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
            
            soloDTO.setPontos(
            Integer.parseInt((
            JOptionPane.showInputDialog("Insira a quantridade de pontos de água presente neste solo: "))
            ));
            
            JOptionPane.showMessageDialog(null, soloCTR.imprimir(soloDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: " + e.getMessage());
        }
    }
}
