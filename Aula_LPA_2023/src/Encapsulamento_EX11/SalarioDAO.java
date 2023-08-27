package Encapsulamento_EX11;

public class SalarioDAO {
    private String genero;
    private double salario;
    private int masc,fem,salfem,total;
    public int percentualHomem(SalarioDTO salarioDTO){
        this.genero = (salarioDTO.getGenero());
        if(this.genero=="m"){
            this.masc += 1; 
            this.total += 1;
        }
        return (this.masc/this.total)*100;
    }
    public int percentualMulher(SalarioDTO salarioDTO){
        this.salario = (salarioDTO.getSalario());
        if(this.genero=="f"){
            this.fem += 1; 
            this.total += 1;
        }
        return (this.fem/this.total)*100;
    }
    public int percentualMulherSalario(){
        if((this.genero=="f")&&(this.salario <= 300.00)){
            this.salfem += 1;
        }
        return (this.salfem/this.total)*100;
    }
}
