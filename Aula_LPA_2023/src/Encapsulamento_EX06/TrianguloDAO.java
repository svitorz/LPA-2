package Encapsulamento_EX06;

public class TrianguloDAO {
    private String classificacao = "";
    private int ladoC,ladoB,ladoA;
    //verificando se os lados formam um triangulo 

    public boolean verificarTriangulo(TrianguloDTO trianguloDTO) {
        this.ladoA = (trianguloDTO.getLado1());
        this.ladoB = (trianguloDTO.getLado2());
        this.ladoC = (trianguloDTO.getLado3());
        
        if ((this.ladoA + this.ladoB > this.ladoC)
                && (this.ladoA + this.ladoC > this.ladoB)
                && (this.ladoC + this.ladoB > this.ladoA)) {
           return true;
        } else {
            return false;
        }
    }
    
    public String calcularTriangulo(TrianguloDTO trianguloDTO) {
        if (verificarTriangulo(trianguloDTO) == true) {
              if((this.ladoA == this.ladoB)
               &&(this.ladoA == this.ladoC)
               &&(this.ladoB == this.ladoC)) 
                {
                    this.classificacao = "O triângulo é equilátero!";
                }
                else if((this.ladoA == this.ladoB)
                 || (this.ladoA == this.ladoC)
                 || (this.ladoB == this.ladoC)) 
                        {
                            this.classificacao = "O triângulo é isósceles!";
                        } 
                        else if ((this.ladoA != this.ladoB)
                            && (this.ladoA != this.ladoC)
                            && (this.ladoB != this.ladoC)                       
                            && (this.ladoA + this.ladoB > this.ladoC)
                            && (this.ladoA + this.ladoC > this.ladoB)
                            && (this.ladoC + this.ladoB > this.ladoA))
                            {
                                this.classificacao = "O triângulo é escaleno!";
                                } 
                            else {
                        this.classificacao = "O triangulo é inválido";
                                      } 
                            return this.classificacao;
        } else {
            return "Os lados não formam um triangulo";
        }
    }
}


