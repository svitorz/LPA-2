package Exercicio_02;

public class AlunoDTO extends PessoaDTO{
    String prontuario;
    public void setProntuario(String prontuario){ this.prontuario = prontuario; }
    public String getProntuario(){ return prontuario; }
    String curso;
    public void setCurso(String curso){ this.curso = curso; }
    public String getCurso(){ return curso; }
}
