package HerancaEX02;

public class JuridicoDAO extends ClienteDAO{
    
        public String mostrarDadosJuri(JuridicoDTO juridicoDTO){
            return "O cnpj de " + juridicoDTO.getNome() + " é " +
                    juridicoDTO.getCnpj() + " e o IE é " + juridicoDTO.getIe();
        }
    }
