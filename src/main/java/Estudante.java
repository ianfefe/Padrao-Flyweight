public class Estudante {
    private String nome;
    private Instituicao instituicao;

    public Estudante(String nome, Instituicao instituicao) {
        this.nome = nome;
        this.instituicao = instituicao;
    }

    public String getEstudante() {
        return "Estudante{" +
                "nome='" + this.nome + '\'' +
                ", instituicao='" + instituicao.getNome() + '\'' +
                ", sigla='" + instituicao.getSigla() + '\'' +
                '}';
    }
}
