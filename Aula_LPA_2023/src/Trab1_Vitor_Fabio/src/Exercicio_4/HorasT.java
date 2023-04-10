package Exercicio_4;

public class HorasT {
    private double qnt_horas, salmin, qnt_extra,valorhora, valorextra, salbruto, recebextra, salliq;
    
    public String calculoSalario(double qnt_horas, double salmin, double qnt_extra) {
        this.qnt_horas = qnt_horas;
        this.salmin = salmin;
        this.qnt_extra = qnt_extra;
        this.valorhora = salmin/8;
        this.valorextra = salmin/4;
        this.salbruto = qnt_horas * valorhora;
        this.recebextra = qnt_extra * valorextra;
        this.salliq = salbruto + recebextra;
    
        return"O salário a receber é " + this.salliq;
    }
}
