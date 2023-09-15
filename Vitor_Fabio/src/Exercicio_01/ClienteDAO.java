
package Exercicio_01;

public class ClienteDAO {
    
   public String mostrarDadosCli(ClienteDTO clienteDTO){
      return "O nome do cliente é "+ clienteDTO.getNome() +
              "\n O endereço do " + clienteDTO.getNome() + " é " + clienteDTO.getEndereco() + " , " + clienteDTO.getNumero() 
              + "\n Na cidade " + clienteDTO.getCidade() +
              "\n No estado " + clienteDTO.getEstado();
   }// fecha classe
} // fecha DAO
