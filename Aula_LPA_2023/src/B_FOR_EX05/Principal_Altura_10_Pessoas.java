/*
* COnstruir um algoritmo que leia a altura de 10 pessoas. O algoritmo deve calcular e
* imprimir quantas pessoas possuem altura maior que 2 metros e a 
* media das alturas.
* OBS:Deve ser criado um método para fazer os calculos, um para mostrar a média das alturas
e outro para ,mostrar a quantidade de pessoas com mais de 2 metros.
*/

package B_FOR_EX05;

import javax.swing.JOptionPane;

public class Principal_Altura_10_Pessoas {
    public static void main (String[] args){
        Altura_10_Pessoas altura_pessoas = new Altura_10_Pessoas();
        
        for(int i=1; i<=10; i++) {
            altura_pessoas.calculo_Altura(
            Double.parseDouble(
                    JOptionPane.showInputDialog("Informe sua altura:")
            )) ;
        } // fecha for  
        JOptionPane.showMessageDialog(null, "A média das alturas é: " + altura_pessoas.mostrar()); 
        JOptionPane.showMessageDialog(null, "A quantidade de pessoas maiores que 2 metros é: " + altura_pessoas.mostrar_altura());

    }   // fecha main
}   // Fecha classe

