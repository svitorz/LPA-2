/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_WHILE_EX01;

/**
 *
 * @author Aluno
 */
public class ExemploWhile {
    private int soma,numero;
    
    public void somar (int numero) {
        this.numero = numero;
        this.soma += this.numero;
    }
    public int mostra(){
        return this.soma;
    }
}
