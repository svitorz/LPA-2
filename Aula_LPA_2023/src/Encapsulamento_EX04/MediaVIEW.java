package Encapsulamento_EX04;

import javax.swing.JOptionPane;

public class MediaVIEW {
    public static void main (String args[]) {
        try{
            MediaDTO mediaDTO = new MediaDTO();
            MediaCTR mediaCTR = new MediaCTR();
            
            mediaDTO.setN1(
            Integer.parseInt((
            JOptionPane.showInputDialog("Insira sua primeira nota: "))
            ));
            
            mediaDTO.setN2(
            Integer.parseInt((
                    JOptionPane.showInputDialog("Insira a sua segunda nota: "))
            ));
               
            JOptionPane.showMessageDialog(null, mediaCTR.imprimir(mediaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: " + e.getMessage());
        }
    }
}
