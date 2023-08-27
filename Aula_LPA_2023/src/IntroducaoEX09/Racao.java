package IntroducaoEX09;

public class Racao {
    private double restante, peso, quantum, quandois, pesogr, g1, g2, gatototal;
    
    public String calculoRacao (double peso, double quantum, double quantdois) {
        this.peso = peso;
        this.quantum = quantum;
        this.quandois = quantdois;
        this.pesogr = peso * 1000;
        this.g1 = quantum * 5;
        this.g2 = quantdois * 5;
        this.gatototal = g1 + g2;
        this.restante = (pesogr - gatototal) / 1000;
               
        return"A quantidade restante em gramas é: " + this.restante;
    } // fecha main
}//fecha classe