package Introducao_EX11;


public class Espetaculo {
    private double custo, preconv, qntco; 
            
    public String calculoEspetaculo (double custo, double preconv) {
        this.custo = custo;
        this.preconv = preconv;
        this.qntco = this.custo/this.preconv;
        
        return"A quantidade de convites vendidos é " + this.qntco;
    }        
}
