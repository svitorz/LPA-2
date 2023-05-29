package Encapsulamento_EX06;

import javax.swing.JOptionPane;

public class TrianguloVIEW {
    public static void main (String args[]) {
        try {
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            
            trianguloDTO.setLado1(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de um lado: ")
            ));
            
            trianguloDTO.setLado2(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de um lado: ")
            ));
            
            trianguloDTO.setLado3(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de um lado: ")
            ));
            
            JOptionPane.showMessageDialog(null, trianguloCTR.imprimir(trianguloDTO));
       }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
        }
    }
}
