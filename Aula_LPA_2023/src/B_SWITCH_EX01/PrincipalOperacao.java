package B_SWITCH_EX01;

import javax.swing.JOptionPane;

public class PrincipalOperacao {
    public static void main (String[] args) {
        Operacao operacao = new Operacao(); 
        
        int op,n1,n2;
        
        op = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação: "));
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));        
     
        JOptionPane.showMessageDialog(null, operacao.calcular(op,n1,n2));
    }
}
