package Exercicio_01;

public class FisicoCTR {
    
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String mostrarDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostrarDadosCli(fisicoDTO) + fisicoDAO.mostrarDadosFisi(fisicoDTO);
    }
}
