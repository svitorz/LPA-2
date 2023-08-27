/*
Escreva um algoritmo que leia o número de andares de um predio e, 
a seguir para cada andar do prédio, leia o número de pessoas que entraram e saíram do
elevador.
Considere que o elevador está vazio e está subindo, os dados se referem apenas a uma subida do
elevador e qe o npumero de pessoas dentro do elevador será sempre maior ou igual a zero.
    Se o número de pessoas, após a entrada e saída, for maior que 15, deve ser mostrada a nebsagen
"Excesso de passageiros. Devem sair X passageiros", senco x o numero de pessoas que devem sair do elevador
de modo que seja obedecido o limite de 15 passageiros.
    Após a entrada e saida no ultimo andar, o algoritmo deve mostrar quantas pessoas permaneceam no elevador para
descer.

 */
package Encapsulamento_EX12;

public class ElevadorDTO {

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public int getEntra() {
        return entra;
    }

    public void setEntra(int entra) {
        this.entra = entra;
    }

    public int getSai() {
        return sai;
    }

    public void setSai(int sai) {
        this.sai = sai;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    private int andares, entra,sai,pessoas, contador;
    
}
