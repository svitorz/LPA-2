package IntroducaoEX08;

public class Salario {
private double salariomin, horastr, salbruto, imp, saliq, vhoras;

public String calculoValor (double salariomin, double horastr) { 
    this.salariomin = salariomin;
    this.horastr = horastr;
    this.vhoras = this.salariomin / 2;
    this.salbruto = this.horastr * vhoras;
    this.imp = this.salbruto * 0.03;
    this.saliq = this.salbruto - imp;
   
        
    return"O valor do salario liquido é " + this.saliq;
    } //fecha string
}//fecha classe
