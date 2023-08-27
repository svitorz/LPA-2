package Exercicio_2;

public class Divisao {
    private double n1,n2,resultado;
    
    public String calculoDivisao(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = n1 / n2;
        
        return"O resultado é: " + resultado;
    }
}
