/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamento_EX02;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
    public String imprimir(FuncionarioDTO funcionarioDTO) {
     return "O código informado foi: " +
             funcionarioDTO.getCodigo()
             + "\n O telefone informado foi: " +
             funcionarioDTO.getTelefone();
    }    
}
