package HerancaEX01;

public class VeiculoDAO {
    
    public String imprimirPlaca(VeiculoDTO veiculoDTO){
        return "A Placa é " + veiculoDTO.getPlaca();
    }
    
    public String imprimirCor(VeiculoDTO veiculoDTO){
        return "A cor é " + veiculoDTO.getCor();
    }
}
            
