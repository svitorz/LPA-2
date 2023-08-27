package HerancaEX01;

public class CarroDAO extends VeiculoDAO{
    
    public String imprimiPotencia(CarroDTO carroDTO){
        return "A potência do carro é "+ carroDTO.getPotencia();
    }
    
    public String imprimiQtd_portas(CarroDTO carroDTO){
        return "A quantidade de portas é "+ carroDTO.getQnt_portas();
    }

}
