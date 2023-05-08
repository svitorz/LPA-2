/*
Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma certa
cidade, num determinado dia.
Paracada casa visitada é fornecido o npumero do canal (9, 12, 23, 40).

Fazer um algoritmo que: 
    -leia um número indeterminado de dados,
    até que seja digitado o canal 0
    
    -Calcule e mostre a quantidade de audiencia de cada emissora.

    -caso seja digitado algum canal fora dos apresentados acima, informar como outros
    canais

*/
package WHILE_EX03;

import javax.swing.JOptionPane;

public class Principal_CanalTv {
    public static void main (String[] args){
        While_CanalTv canaltv = new While_CanalTv();
        
        int e;
        
         do{
             e = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe o canal de televisão: (9, 12, 23, 40) "));
             canaltv.somar(e);
         }while(e!=0);
         JOptionPane.showMessageDialog(null, canaltv.mostrar());
    }
}
