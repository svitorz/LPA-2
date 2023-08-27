/*
Faça um algoritmo que receba a altura e o peso de uma pessoa.
de acordo com a tabela a seguir verifique e mostre qual
a classificação da pessoa.
                    peso
            |        |                |   
altura      | ate 60 |entre 60 e      |  
            |        | 90 (Inclusive) | Acima de 90
-------------------------------------------------------
menores de |  A      |      D         |    G    
1,20       |         |                |             
--------------------------------------------------------
de 1,20    |  B     |      E          |    H    
 a 1,70    |         |                |             
--------------------------------------------------------
maiore que |  C      |      F         |    I    
1,70       |         |                |             
--------------------------------------------------------

 */
package B_IF_EX04;

import javax.swing.JOptionPane;

public class Principal_altura_peso {

    public static void main(String args[]) {
        Altura_Peso_Classificacao altura_peso_classificacao = new Altura_Peso_Classificacao();

        JOptionPane.showMessageDialog(null,
                altura_peso_classificacao.mostrar_Classificacao(
                        Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")),
                        Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "))
                )
        );
    }

}
