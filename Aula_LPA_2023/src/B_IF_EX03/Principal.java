package B_IF_EX03;

import javax.swing.JOptionPane;

public class Principal {
    public static void main (String args[] ) {
     Quatro_Numeros_Ordem_Crescente quatro_numero = new
             Quatro_Numeros_Ordem_Crescente();
     
     int num1, num2,num3,num4;
     
     JOptionPane.showMessageDialog(null,
             "Digite os três Numeros em ordem crescente: ");
    
     num1 = Integer.parseInt(
     JOptionPane.showInputDialog("Informe o numero 1: "));
     num2 = Integer.parseInt(
     JOptionPane.showInputDialog("Informe o numero 2: "));        
     num3 =Integer.parseInt(
     JOptionPane.showInputDialog("Informe o numero 3: "));
     num4 = Integer.parseInt(
     JOptionPane.showInputDialog("Digite o quarto numero "
     + "fora da ordem acima informada"));
    JOptionPane.showMessageDialog(null,
             quatro_numero.ordenar_Numeros(num1, num2, num3, num4));
    }
}
