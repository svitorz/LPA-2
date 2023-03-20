/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroducaoEX03;

public class Salario {
    private double salario, salario_final, aumento;
    
    public double calcularSalario(double salario, double aumento) {
    this.salario = salario;
    this.aumento = aumento; 
    this.salario_final = this.salario + (this.salario*this.aumento/100);
            
            return salario_final;
    } // fecha main
} //fecha classe