package Atividade_4;

public class CardapioCTR {
    CardapioDAO cardapioDAO = new CardapioDAO();
    
     public String imprimir(CardapioDTO cardapioDTO) {
        return cardapioDAO.imprimirConta(cardapioDTO);
    }
}
