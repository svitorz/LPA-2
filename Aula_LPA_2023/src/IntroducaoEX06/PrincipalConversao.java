/*
faca um programa que receba uma medida em pes
faca as conversoes a seguir e mostre os resultados
a) polegadas
b) jardas
c) milhas
sabesse que:
1 pe = 12 polegadas
1 jarda = 3 pes
1 milha = 1760 jardas
*/
package IntroducaoEX06;

import javax.swing.JOptionPane;

public class PrincipalConversao {
    public static void main (String[] args) {
        Conversao conversao = new Conversao();
        
        double pes;
        
        pes = Double.parseDouble (
        JOptionPane.showInputDialog ("Informe a medida em pés: "));
        
        JOptionPane.showMessageDialog(null, conversao.medidaConv(pes));
    }
}
