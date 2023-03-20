package IntroducaoEX05;

public class Salario {
    private double sal, desconto, sal_final;
    
    public String calcularSalario (double sal) {
        this.sal = sal;
        this.desconto = sal * 0.10;
        this.sal_final = this.sal + 50.0 - this.desconto;
        
        return "O salario final do funcionario e de: " + sal_final;
    } 
}
