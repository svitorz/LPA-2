package Exercicio_01;

public class JuridicoDAO extends ClienteDAO{
    
        public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
            return "\n O cnpj de " + juridicoDTO.getNome() + " é " +
                    juridicoDTO.getCnpj() + "\n E o IE é " + juridicoDTO.getIe();
        }
    }
