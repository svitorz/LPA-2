package Encapsulamento_EX03;

public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String imprimir(MotoristaDTO motoristaDTO){
        return motoristaDAO.calcular(motoristaDTO);
    }
}
