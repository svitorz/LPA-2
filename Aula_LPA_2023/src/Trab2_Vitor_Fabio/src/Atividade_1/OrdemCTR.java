package Atividade_1;

public class OrdemCTR {
    OrdemDAO ordemDAO = new OrdemDAO();
    
    public String imprimir(OrdemDTO ordemDTO) {
        return ordemDAO.ordenarNumeros(ordemDTO); 
    }    
}
