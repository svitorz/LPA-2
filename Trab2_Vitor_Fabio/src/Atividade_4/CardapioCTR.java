package Atividade_4;

public class CardapioCTR {
    CardapioDAO cardapioDAO = new CardapioDAO();
    
    public void mostrarCod(CardapioDTO cardapioDTO){
        cardapioDAO.somarConta(cardapioDTO);
    }
    
     public String imprimir(CardapioDTO cardapioDTO) {
        return cardapioDAO.imprimirConta(cardapioDTO);
    }
}
