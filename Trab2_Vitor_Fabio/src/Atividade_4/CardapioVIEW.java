package Atividade_4;

import javax.swing.JOptionPane;
        
public class CardapioVIEW {
    public static void main (String args[]){
    try {
    CardapioCTR cardapioCTR = new CardapioCTR();
    CardapioDTO cardapioDTO = new CardapioDTO();
    
 do{
        cardapioDTO.setCodigo(
        Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto: ")
            ));
        
        cardapioCTR.mostrarCod(cardapioDTO);
        if(cardapioDTO.getCodigo() > 5){
            JOptionPane.showMessageDialog(null, "O código inserido é invalido!");
        }
    } while(cardapioDTO.getCodigo()!=0);
        
     JOptionPane.showMessageDialog(null, cardapioCTR.imprimir(cardapioDTO));
     
    } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null,
            "Erro no sistema: "+e.getMessage());
        }
    }
}
