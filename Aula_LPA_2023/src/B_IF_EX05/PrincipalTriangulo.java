/*
    * Dados 3 valores ladoA, ladoB, ladoC. Estes valores
    * representam lados de um triângulo.
    Com base nisso verificar:
    a)Se podem ser valores dos lados formam um triangulo;
    b)Se formar um triangulo, determine qual: equilatero, isosceles ou escaleno;
    c)A resposta deve ser devolvida para a classe principal para ser mostrada;
 */
package B_IF_EX05;

import javax.swing.JOptionPane;

public class PrincipalTriangulo {
   public static void main(String args[]) {
    Triangulo triangulo = new Triangulo();
        
    JOptionPane.showMessageDialog(null,
            triangulo.classificar_Triangulo(
            Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de um lado do quadrado: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de um lado do quadrado: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de um lado do quadrado: "))
            )
        );
    
   }
}
