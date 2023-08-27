/*
Faça um algoritmo que receba três numeros obrigatoriamente em ordem crescente 
(do menor para o maior) e um quarto numero (número qualquer) que nao siga a regra dos três primeiros
Ao final o algoritmo deve imprimir os quatrros números em ordem decrescente (do maior
para o menor)
Os números devem ser do tipo inteiro.
 */
package B_IF_EX03;

public class Quatro_Numeros_Ordem_Crescente {
private int num1, num2,num3,num4;
private String resposta;

public String ordenar_Numeros(int num1,int num2,int num3,int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        
        if(this.num4 >= this.num3) {
            this.resposta = "A ordem decrescente é: " +
                    this.num4 + " - " + this.num3 +" - " +
                    this.num2 +" - " + this.num1;
        } // close if
        else {
            if((this.num4 >= this.num2) && (this.num4  < this.num3)) {
            this.resposta = "A ordem decrescente é: " +
                    this.num3 + " - " + this.num4 +" - " +
                    this.num2 +" - " + this.num1;
            }// close if 2    
        
        else {
            if((this.num4 >= this.num1) && (this.num4 < this.num2)) {
            this.resposta = "A ordem decrescente é: " +
                    this.num3 + " - " + this.num2 +" - " +
                    this.num1 +" - " + this.num4;
            }// close if 3
        }// close else 2
      } // close else 1
        return this.resposta;
    } // close string
} //close class
