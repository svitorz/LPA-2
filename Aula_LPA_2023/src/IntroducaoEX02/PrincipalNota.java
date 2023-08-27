package IntroducaoEX02;

import javax.swing.JOptionPane;

public class PrincipalNota {
    public static void main(String[] args) {
        Nota nota = new Nota();
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3:"));
        double p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a peso 1:"));
        double p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a peso 2:"));
        double p3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a peso 3:"));
        JOptionPane.showMessageDialog(null,nota.calcularMedia(n1,n2,n3,p1,p2,p3));

    } //fecha main
} //fecha classe
