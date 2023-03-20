/*
calcular a quantidade de litros de combustivel gastos em uma viagem.
para obter o calculo, o usuario devera fornecer o tempo gasto em horas,
quantos km/l que o carro faz e a velocidade media durante a viagem.
o programa devera apresentar os valores da velocidade media, tempo gasto na viagem,
a distancia percorrida e a quantidade de litros utilizados na viagem.
 */
package Introducao_EX12;

import javax.swing.JOptionPane;

public class PrincipalCombustivel {
    public static void main (String[] args) {
        Combustivel combustivel = new Combustivel();
        
        double tempogas, velocmedia, kml;
        
        tempogas = Double.parseDouble(
                JOptionPane.showInputDialog("Insira o tempo gasto na viagem: "));
        
        velocmedia = Double.parseDouble(
                JOptionPane.showInputDialog("Insira a velocidade media na viagem: "));
        
        kml = Double.parseDouble(
                JOptionPane.showInputDialog("Insira a quantos km por litro o carro faz: "));
        
        JOptionPane.showMessageDialog(null, combustivel.calculoCombustivel(tempogas,velocmedia,kml));
        }
}
