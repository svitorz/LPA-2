/*
    Faça um algoritmo que solicite 10 números inteiros.
ao final o algoritmo deve informar o maior e o menor numero digitado.
OBS: Deve ser criado um método para verificar os numeros e outro somente para mostrar o resultado.

*/
package B_FOR_EX07;

import javax.swing.JOptionPane;

public class Principal_Maior_Menor_Numero {
    public static void main (String[] args) {
        Maior_Menor_Numero maior_menor = new Maior_Menor_Numero();
        
        for(int i=1;i<=10;i++) {
            maior_menor.calculo(
            Integer.parseInt(
            JOptionPane.showInputDialog("Informe um número inteiro: "))
            );
            }
            JOptionPane.showMessageDialog(null, maior_menor.mostrar());
    }
}
