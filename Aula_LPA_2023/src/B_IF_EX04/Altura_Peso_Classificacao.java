/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_IF_EX04;

/**
 *
 * @author Aluno
 */
public class Altura_Peso_Classificacao {

    private double peso, altura;
    private String resposta;

    public String mostrar_Classificacao(double alt, double peso) {
        this.altura = altura;
        this.peso = peso;

        if (this.altura < 1.20) {
            if (this.peso <= 60) {
                this.resposta = "A";
            } else {
                if ((this.peso > 60) && (this.peso <= 90)) {
                    this.resposta = "D";
                } else {
                    this.resposta = "G";
                }
            }
        } else {
            if ((this.altura >= 1.20) && (this.altura <= 1.70)) {
                this.resposta = "B";
            } else {
                if ((this.peso > 60) && (this.peso <= 90)) {
                    this.resposta = "E";
                } else {
                    this.resposta = "H";
                }
            }
            else{
                    if(this.peso <= 60) {
                     this.resposta = "C";
                    }
                    else{
                    if((this.peso > 60) && (this.peso <=90)) {
                    this.resposta = "F";
                    }
                    else {
                    this.resposta = "I";
                    }
                  }    
            }
        }
        return"A classificação é " + this.resposta;
    }
}
