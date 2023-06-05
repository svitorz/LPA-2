/*
Faça um programa que receba o preço de um produto, calcule e mostre os preços a
pagar, sabendo-se que para pagamento à vista tem um desconto de 5% e para
pagamento a prazo tem um acréscimo de 10%.
 */
package Exercicio_3;

import javax.swing.JOptionPane;

public class PrincipalPreco {
    public static void main (String[] args) {
    Preco preco = new Preco();
        
        
    double valor;
        
    valor = Double.parseDouble(
    JOptionPane.showInputDialog("Insira o valor do produto: "));
    
    JOptionPane.showMessageDialog(null, preco.calculoPreco(valor));
    }           
}
