package Encapsulamento_EX01;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String args[]) {
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe seu rg: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));
            
            JOptionPane.showMessageDialog(null,
                    clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null,
                    clienteCTR.mostrarNomeIdade(clienteDTO));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro no sistema: "+
                    e.getMessage());
        }
    }
}
