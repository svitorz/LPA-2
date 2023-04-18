/*
Faça um algoritmo que receba 10 numeros inteiros e ao final mostre a soma dos mesmos.
OBS: debe ser criado um método para somar os numeros e outro para mostrar o resultado.
*/
package B_FOR_EX04;

import javax.swing.JOptionPane;

public class PrincipalNumeroSoma {
    public static void main(String[] args){
        NumeroSoma numerosoma = new NumeroSoma();
        
        for(int i=1; i<=10; i++) {
            numerosoma.soma_Numero(
            Integer.parseInt(
            JOptionPane.showInputDialog("Informe um número: "))
            );
            }
            JOptionPane.showMessageDialog(null,
                    "A soma dos números é: " + numerosoma.mostrar_Numero());
    
    }
}
