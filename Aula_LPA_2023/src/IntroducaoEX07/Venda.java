/*
O custo do consumidor de um carro novo é a soma do preço de fábrica com o percentual de 
lucro do distribuidor e dos impostos ao preço de fábroca. Faça um programa que receba o preço de fábrica
de um veiculo, o percentual de lucro do distribuidor e o percentual de impostos.
a) o valor correspondente ao lucro do distribuidor;

b) o valor correspondente ao imposto; 

c) o preco final do veiculo;
*/
package IntroducaoEX07;

public class Venda {
private double precofa, perluc, imposto, precofin, lucdist, percimposto;

public String calculoValor (double precofa, double perluc, double percimposto) { 
    this.precofa = precofa;
    this.percimposto = percimposto;
    this.perluc = perluc;
    
    this.lucdist = this.precofa * (this.perluc / 100);
    this.imposto = this.precofa * (this.percimposto / 100);
    this.precofin = this.precofa + this.lucdist + this.imposto;
        
    
    return"O valor correspondente ao lucro do distribuidor é " + this.lucdist +
    "\nO valor correspondente ao imposto é " + this.imposto +
    "\nO preço final do veículo é " + this.precofa;
    } //fecha string
}//fecha classe
