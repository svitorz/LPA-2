package HerancaEX01;

import javax.swing.JOptionPane;

public class VeiculoVIEW {
    public static void main(String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o objeto carro.");
            CarroDTO carroDTO = new CarroDTO();
            CarroDAO carroDAO = new CarroDAO();
            
            carroDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa do carro: "));
            carroDTO.setCor(JOptionPane.showInputDialog("Informe a cor do carro: "));
            carroDTO.setPotencia(Integer.parseInt(     
                JOptionPane.showInputDialog("Informe a potência do carro:")));
            carroDTO.setQnt_portas(Integer.parseInt(     
                JOptionPane.showInputDialog("Informe a quantidade de portas do carro:")));

            JOptionPane.showMessageDialog(null, carroDAO.imprimirPlaca(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimirCor(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimiPotencia(carroDTO));
            JOptionPane.showMessageDialog(null, carroDAO.imprimiQtd_portas(carroDTO));
            /**                     Separação dos objetos                         **/
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o objeto moto.");
            MotoDTO motoDTO = new MotoDTO();
            MotoDAO motoDAO = new MotoDAO();
            
            motoDTO.setPlaca(JOptionPane.showInputDialog("Informe a placa da moto: "));
            motoDTO.setCor(JOptionPane.showInputDialog("Informe a cor da moto: "));
            motoDTO.setCilindrada(Integer.parseInt(     
                JOptionPane.showInputDialog("Informe a cilindrada da moto:")));
            motoDTO.setTipo_motor(JOptionPane.showInputDialog("Informe o tipo do motor: 2 ou 4?"));

            JOptionPane.showMessageDialog(null, motoDAO.imprimirPlaca(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimirCor(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimiCilindrada(motoDTO));
            JOptionPane.showMessageDialog(null, motoDAO.imprimiTipo_motor(motoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
