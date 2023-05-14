/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_EX05;

/**
 *
 * @author Aluno
 */
public class Triangulo {

    private double ladoA, ladoB, ladoC;
    private String classificacao;

    public String classificar_Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    
    if((this.ladoA == this.ladoB)&& (this.ladoB == this.ladoC) && (this.ladoA== this.ladoC)){
            this.classificacao= "Triângulo Equilátero";
    }
    
    else if((this.ladoA == this.ladoB) || (this.ladoB == this.ladoC) || (this.ladoA == this.ladoC)){
        this.classificacao="Triângulo Isósceles";
    }
    else if ((this.ladoA != this.ladoB) && (this.ladoB != this.ladoC) && (this.ladoA != this.ladoC) && 
        (this.ladoA+this.ladoB>this.ladoC)&& (this.ladoB+this.ladoC>this.ladoA) && (this.ladoA+this.ladoC>this.ladoB)){
        this.classificacao="Triângulo Escaleno";
    }
    else {
        this.classificacao="Triângulo inválido";
    }
    return "Tipo: " + this.classificacao;
    }  
}
