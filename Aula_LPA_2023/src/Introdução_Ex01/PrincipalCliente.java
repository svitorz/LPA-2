
package Introdução_Ex01;

import javax.swing.JOptionPane;
        
public class PrincipalCliente {
    
    public static void main(String[] args) {
        //conteudo
        Cliente cliente = new Cliente();
        
        System.out.println("=== Chamando os métodos do objetos ======/n");
        cliente.mostrar(JOptionPane.showInputDialog("Informe o nome"),
                JOptionPane.showInputDialog("\nInforme o RG"));
        
        cliente.mostrarNome(JOptionPane.showInputDialog("informe o nome 2"));
        
        System.out.println("== Fim da chamada aos métodos do objeto ====/n");
    }//Fecha main
}//Fecha classe
