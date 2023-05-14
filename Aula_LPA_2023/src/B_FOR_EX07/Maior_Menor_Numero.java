/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_FOR_EX07;

/**
 *
 * @author Aluno
 */
public class Maior_Menor_Numero {
    private int numero,maior,menor;
            
        public void calculo (int numero) {
                this.numero = numero; 
                this.maior = 0;
                this.menor = 9999999;
                
                 if (this.numero > this.maior) {
                     this.maior = this.numero;
                 } else 
                     if(this.numero < this.menor) {
                         this.menor = this.numero;
                       }
            }
        
        public String mostrar(){
            return"O maior número digitado foi " + this.maior +
                    "\nO menor número digitado foi: " + this.menor;
        }
 }
