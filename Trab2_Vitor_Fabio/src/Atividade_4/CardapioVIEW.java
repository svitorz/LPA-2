package Atividade_4;

import javax.swing.JOptionPane;
        
public class CardapioVIEW {
    public static void main (String args[]){
    try {
    CardapioCTR cardapioCTR = new CardapioCTR();
    CardapioDTO cardapioDTO = new CardapioDTO();
    
  while(cardapioDTO.getCodigo()!=0){
        cardapioDTO.setCodigo(
        Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto: ")
            ));
    }
        
     JOptionPane.showMessageDialog(null, cardapioCTR.imprimir(cardapioDTO));
     
    } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null,
            "Erro no sistema: "+e.getMessage());
        }
    }
}
