/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerancaEX01;

/**
 *
 * @author Aluno
 */
public class MotoDAO extends VeiculoDAO{
    public String imprimiCilindrada(MotoDTO motoDTO){
       return "A cilindrada é: "+ motoDTO.getCilindrada();
    }
    
    public String imprimiTipo_motor(MotoDTO motoDTO){
       return "O tipo do motor é: "+ motoDTO.getTipo_motor();
    }
}
