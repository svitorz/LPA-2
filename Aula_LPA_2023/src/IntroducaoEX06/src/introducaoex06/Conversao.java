package introducaoex06;

public class Conversao {
    private double pes, polegadas, jardas, milhas;
    
    public String converterMedida (double pes) {
        this.pes = pes;
        
        this.polegadas = this.pes * 12;
        this.jardas = this.pes / 3;
        this.milhas = this.jardas / 1760;
        
        return"O número de pés é: " + this.pes + 
                "\nO número de polegadas é: " + this.polegadas +
                "\nO número de jardas é" + this.jardas +
                "\nO número de milhas é: " + this.milhas;
    }   
}
