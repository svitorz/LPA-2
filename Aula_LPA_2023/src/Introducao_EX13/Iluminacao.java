package Introducao_EX13;


public class Iluminacao {
    private double potencia, base, h, area;
    
    public String calculoIluminacao (double base, double h) {
        this.base = base;
        this.h = h;
        this.area = base * h;
        this.potencia = this.area * 18;
        
        return"A área do comodo é " + this.area +
                "\nE a potencia necessaria é " + this.potencia;
    }
}
