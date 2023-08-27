package Encapsulamento_EX11;

public class SalarioCTR {
    SalarioDAO salarioDAO = new SalarioDAO();
    
    public int imprimirH(SalarioDTO salarioDTO) {
        return salarioDAO.percentualHomem(salarioDTO);
    }
    
    public int imprimirF(SalarioDTO salarioDTO) {
        return salarioDAO.percentualMulher(salarioDTO);
    }
    
    public int imprimirFS(SalarioDTO salarioDTO) {
        return salarioDAO.percentualMulherSalario(salarioDTO);
    }
}
