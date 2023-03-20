/*
sabe-se que para iluminar de maneira correta os comodos de uma casa, para cada metro quadrado,
deve-se usar 18w de potencia.
faca um programa que receba as duas dimensoes de um comodo (em metros), calcule e mostre a sua area
(em metros quadrados0 e a potencia de iluminação que devera se utilizada.
 */
package Introducao_EX13;

import javax.swing.JOptionPane;

public class PrincipalIluminacao {
    public static void main (String[] args) {
        
        Iluminacao iluminacao = new Iluminacao();
        
        double base,h;
        
        base = Double.parseDouble(
        JOptionPane.showInputDialog("Insira a base do comodo: "));
        
        h = Double.parseDouble(
        JOptionPane.showInputDialog("Insira a altura do comodo: "));
        
        JOptionPane.showMessageDialog(null, iluminacao.calculoIluminacao(base,h));
    }
}
