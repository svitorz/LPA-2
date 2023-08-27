package Encapsulamento_EX12;

import javax.swing.JOptionPane;

public class ElevadorVIEW {
 public static void main (String args[]) { 
        try {
            ElevadorDTO elevadorDTO = new ElevadorDTO();
            ElevadorCTR elevadorCTR = new ElevadorCTR();
            
            elevadorDTO.setAndares(
            Integer.parseInt(JOptionPane.showInputDialog("Insira o número de andares: ")
            ));
            
            for(elevadorDTO.getContador(1);elevadorDTO.getContador()<= elevadorDTO.getAndares(); elevadorDTO.getContador()++;){
                elevadorDTO.setEntra(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que entraram no elevador")));
                elevadorDTO.setSai(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que saíram do elevador")));
             }
            
            JOptionPane.showMessageDialog(null, elevadorCTR.imprimir(elevadorDTO));
       }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
         }
    }
}
