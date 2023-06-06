/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_4;

import java.text.DecimalFormat;

public class CardapioDAO {   
   boolean valida;
    String conta;
    DecimalFormat decimalformat = new DecimalFormat("#,###.00");
    public boolean somarConta(CardapioDTO cardapioDTO) {
        try {
            valida = true;
            if (cardapioDTO.getCodigo() == 1) {
                cardapioDTO.setNumero_h(cardapioDTO.getNumero_h() + 1);
                cardapioDTO.setValor_total(cardapioDTO.getValor_total() + 1.50);
            } 
            else {
                if (cardapioDTO.getCodigo() == 2) {
                    cardapioDTO.setNumero_c(cardapioDTO.getNumero_c() + 1);
                    cardapioDTO.setValor_total(cardapioDTO.getValor_total() + 1.80);
                } 
                else {
                    if (cardapioDTO.getCodigo() == 3) {
                        cardapioDTO.setNumero_m(cardapioDTO.getNumero_m() + 1);
                        cardapioDTO.setValor_total(cardapioDTO.getValor_total() + 1.20);
                    } 
                    else {
                        if (cardapioDTO.getCodigo() == 4) {
                            cardapioDTO.setNumero_a(cardapioDTO.getNumero_a() + 1);
                            cardapioDTO.setValor_total(cardapioDTO.getValor_total() + 2.00);
                        } 
                        else {
                            if (cardapioDTO.getCodigo() == 5) {
                                cardapioDTO.setNumero_q(cardapioDTO.getNumero_q() + 1);
                                cardapioDTO.setValor_total(cardapioDTO.getValor_total() + 1.00);
                            } 
                            else {
                                if ((cardapioDTO.getCodigo() != 0)||(cardapioDTO.getCodigo() > 5)) {
                                    valida = false;
                                }
                            }
                        }
                    }
                }
            }
            return this.valida;
        } // fecha o try
        catch (Exception e) {
            System.out.println("Erro 001");
            return this.valida = false;
        } // fecha o catch
    } // fecha o metodo

    public String imprimirConta(CardapioDTO cardapioDTO) {
        try {
            this.conta = "===========================================";
            this.conta += "\nProduto     | Quantidade    | Valor     ";
            this.conta += "\n===========================================";

            if (cardapioDTO.getNumero_h() >= 1) {
                this.conta += "\nHamburger           " + cardapioDTO.getNumero_h() + "               R$" + cardapioDTO.getNumero_h() * 1.50;
            }
            if (cardapioDTO.getNumero_c() >= 1) {
                this.conta += "\nCheeseburger     " + cardapioDTO.getNumero_c() + "               R$" + cardapioDTO.getNumero_c() * 1.80;
            }
            if (cardapioDTO.getNumero_m() >= 1) {
                this.conta += "\nMisto Quente     " + cardapioDTO.getNumero_m() + "               R$" + cardapioDTO.getNumero_m() * 1.20;
            }
            if (cardapioDTO.getNumero_a() >= 1) {
                this.conta += "\nAmericano           " + cardapioDTO.getNumero_a() + "               R$" + cardapioDTO.getNumero_a() * 2.00;
            }
            if (cardapioDTO.getNumero_q() >= 1) {
                this.conta += "\nQueijo Prato        " + cardapioDTO.getNumero_q() + "               R$" + cardapioDTO.getNumero_q() * 1.0;
            }

            this.conta += "\n===========================================";
            this.conta += "\nTotal:   R$" + decimalformat.format(cardapioDTO.getValor_total());
        } // fecha o try
        catch (Exception e) {
            System.out.println("Erro 002");
        } // fecha o catch
        
        return this.conta;
    } // fecha o metodo
}// fecha a classe
        
