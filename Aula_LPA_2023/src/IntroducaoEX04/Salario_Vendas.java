
package IntroducaoEX04;


    public class Salario_Vendas {
       private double sal_inicial, sal_final, comissao, vendas;
       
       public String calcularSalvendas (double sal_inicial, double vendas) {
           this.sal_inicial = sal_inicial;
           this.vendas = vendas;
           this.comissao = this.vendas * 0.04;
           this.sal_final = this.sal_inicial + this.comissao;
           
           return "o valor da comissao e" +this.comissao + 
                   "\nO salario final do funcionario e" + this.sal_final;
      
       } //fecha main 
    } //fecha classe