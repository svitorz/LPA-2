/*
* Faca um algoritmo que solicite dois numeros inteiros e mostre todos os numeros do intervalo
*/
package B_FOR_EX03;

import javax.swing.JOptionPane;

public class PrincipalNumeros {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(); 
        
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        JOptionPane.showMessageDialog(null, numeros.calcular(n1,n2));  
    }
}
