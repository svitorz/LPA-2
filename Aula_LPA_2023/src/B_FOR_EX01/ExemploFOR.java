package B_FOR_EX01;

import javax.swing.JOptionPane;

public class ExemploFOR {
    public static void main(String[] args) {
        int soma;
        soma = 0;
        for(int cont=1; cont<=10; cont++){
            soma = soma + cont;
        }
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
    }
}
