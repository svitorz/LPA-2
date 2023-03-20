/*
Voce esta fazendo um trabalho de classificação de solo.
apos colher uma amostra e verificar a pontuação de agua presente
nela, classificou a amostra em:

Rochosa: se menos ou igual a  10 pontos de agua 
firme: se mais de 10 ou menos ou igual a 40 pontos
pantanosa: se mais de 40 pontos e menos ou igual a 80 pontos
caso seja maior que 80 pontos escrever a mensagem
"Quantidade de agua invalida"
*/
package B_IF_EX02;

import javax.swing.JOptionPane;

public class PrincipalSolo {
        public static void main (String args[]) {
            
         Solo solo = new Solo();
         
         double qnt_agua;
       
         qnt_agua = Double.parseDouble(
        JOptionPane.showInputDialog("Insira a quantidade de agua no solo: "));
        
        JOptionPane.showMessageDialog(null, solo.tipo(qnt_agua));
    }
}
