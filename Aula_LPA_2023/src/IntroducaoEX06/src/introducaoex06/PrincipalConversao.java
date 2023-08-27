package introducaoex06;

import javax.swing.JOptionPane;

public class PrincipalConversao {

    public static void main(String[] args) {
        double pes;
        Conversao conversao = new Conversao();
        
        pes = Double.parseDouble(
        JOptionPane.showInputDialog ("Informe o número de pés: "));
                
        JOptionPane.showMessageDialog(null, conversao.converterMedida(pes));
    }
    
}
