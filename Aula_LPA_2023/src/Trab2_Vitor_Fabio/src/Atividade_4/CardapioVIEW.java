/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_4;

import javax.swing.JOptionPane;
        
public class CardapioVIEW {
    public static void main (String args[]){
    try {
    CardapioCTR cardapioCTR = new CardapioCTR();
    CardapioDTO cardapioDTO = new CardapioDTO();
    
    do {
        cardapioDTO.setCodigo(
        Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto: ")
            ));
    } while(cardapioDTO.getCodigo()!=0);
        
     JOptionPane.showMessageDialog(null, cardapioCTR.imprimir(cardapioDTO));
     
    } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null,
            "Erro no sistema: "+e.getMessage());
        }
    }
}
