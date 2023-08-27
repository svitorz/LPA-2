package Introducao_EX12;

public class Combustivel {
    private double tempogas, velocmedia, kml, combustivel_total, distancia; 

    public String calculoCombustivel (double tempogas,double velocmedia,double kml) {
        this.tempogas = tempogas;
        this.velocmedia = velocmedia;
        this.kml = kml;
        this.distancia = velocmedia * tempogas;
        this.combustivel_total = this.distancia/this.kml;
                
       return"A quantidade de combustivel total gasto foi: " + this.combustivel_total +
               "\na velocidade media foi " + this.velocmedia + 
               "\no tempo gasto foi " + this.tempogas + 
               "\ne a distancia percorrida foi: " + this.distancia;
        
    }
}
 