package Encapsulamento_EX12;

public class ElevadorCTR {
   ElevadorDAO elevadorDAO = new ElevadorDAO();
    
    public String imprimir(ElevadorDTO ElevadorDTO) {
        return elevadorDAO.excessoPassageiro(ElevadorDTO);
    }
}
