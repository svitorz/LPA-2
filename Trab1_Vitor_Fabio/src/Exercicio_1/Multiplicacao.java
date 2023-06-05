package Exercicio_1;

public class Multiplicacao {
    private double n1,n2,n3, resultado;
    
    public String calculoMultiplicacao(double n1, double n2, double n3, double resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        resultado = n1 * n2 * n3;
        
        return"O valor da multiplicação dos três números é: " + resultado;
    }
}
