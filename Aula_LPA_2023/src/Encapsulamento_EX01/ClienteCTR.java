/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_EX01;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String mostrarNomeRg(ClienteDTO clienteDTO) {
        return clienteDAO.mostrarNomeRg(clienteDTO);
    } 
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
}
