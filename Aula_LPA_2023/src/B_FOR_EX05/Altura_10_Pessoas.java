package B_FOR_EX05;

public class Altura_10_Pessoas {
    private double soma,alt,media;
    private int alt2;
    public void calculo_Altura (double alt) {
    this.alt = alt;
    this.soma += alt;
    
    if (this.alt > 2) {
        this.alt2++;
        } // fecha if
    } // Fecha método
    
    public double mostrar(){
        return this.media = this.soma / 10;
    } // fecha método
    
    public int mostrar_altura() {
        return alt2;
    } // fecha classe
} // Fecha Classe
