package Encapsulamento_EX06;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    
    public String imprimir(TrianguloDTO trianguloDTO) {
        return trianguloDAO.calcularTriangulo(trianguloDTO);
    }
}
