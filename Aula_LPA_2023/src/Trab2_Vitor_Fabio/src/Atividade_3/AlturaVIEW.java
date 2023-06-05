/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_3;
import javax.swing.JOptionPane;
public class AlturaVIEW {
    public static void main (String args[]){
        try {
            AlturaCTR alturaCTR = new AlturaCTR();
            AlturaDTO alturaDTO = new AlturaDTO();
            
            alturaDTO.setAltura(
            Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura: ")
            ));
            
            alturaDTO.setPeso(
            Double.parseDouble(JOptionPane.showInputDialog("Insira o seu peso: ")
            ));
            
            JOptionPane.showMessageDialog(null, alturaCTR.imprimir(alturaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
        }
    }
}
