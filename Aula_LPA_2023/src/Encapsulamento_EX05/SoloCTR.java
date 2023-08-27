package Encapsulamento_EX05;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    
    public String imprimir(SoloDTO soloDTO) {
        return soloDAO.calcularTipo(soloDTO);
    }
}
