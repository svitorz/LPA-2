/*
 Um funcionario de uma emprese recebe aumento salarioal anualmente. Sabe-se que
a - esse funcionario foi contratado em 1995, com salario inicial de R$1.000,00;
b - em 1996 recebeu aumento de 1,5% sobre seu salario inicial;
c - a partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro
do percentual do ano anterior.
faça um programa que solicite o ano atual e determine o salario atual desse funcionario
 */
package B_FOR_EXO6;
 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Principal_Salario {
    public static void main (String[] args) {
        DecimalFormat formatando = new DecimalFormat("##,###.00");
        
        Salario_Atual salario_atual = new Salario_Atual();
    
        JOptionPane.showMessageDialog(null,
                "O novo salário é: "+
                        formatando.format(
                        salario_atual.calculo_Salario(
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: ")))
                        )
        );
    }
}
