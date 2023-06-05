package Atividade_3;


public class AlturaCTR {
 AlturaDAO alturaDAO = new AlturaDAO();
 
 public String imprimir(AlturaDTO alturaDTO){
     return alturaDAO.mostrarClassificacao(alturaDTO);
 }
}
