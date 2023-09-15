package Exercicio_02;

public class FuncionarioDAO extends PessoaDAO{
    private String resposta;
    private int valorIdade;
    public String retornaDadosFuncionario(FuncionarioDTO funcionarioDTO) {
        return "A função do funcionário é " + funcionarioDTO.getFuncao() +
                "\n E o SIAPE é " + funcionarioDTO.getSiape();
    }

    public boolean calculoIdade(FuncionarioDTO funcionarioDTO) {
        if (funcionarioDTO.getIdade() > 60){
            return true;
        }else{
            return false;
        }
    }
        public String permitirAposentar(FuncionarioDTO funcionarioDTO){
            if (calculoIdade(funcionarioDTO)==true) {
                return "Pode se aposentar";
            } else {
                return "Faltam " + (60 - funcionarioDTO.getIdade()) + " anos para se aposentar.";
            }
        }
}
