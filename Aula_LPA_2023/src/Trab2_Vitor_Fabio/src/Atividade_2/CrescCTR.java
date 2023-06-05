package Atividade_2;

public class CrescCTR {
    CrescDAO crescDAO = new CrescDAO();
    public String imprimir(CrescDTO crescDTO){
        return crescDAO.ordenarNumeros(crescDTO);
    }
}
