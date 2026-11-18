import java.util.ArrayList;
import java.util.List;

public class Assinatura {

    private List<Estudante> estudantes = new ArrayList<>();

    public void assinar(String nomeEstudante, String nomeInstituicao, String sigla){
        Instituicao instituicao = InstituicaoFactory.getInstituicao(nomeInstituicao, sigla);
        Estudante estudante = new Estudante(nomeEstudante, instituicao);
        estudantes.add(estudante);
    }

    public List<String> obterEstudantes(){
        List<String> saida = new ArrayList<String>();
        for(Estudante estudante : estudantes){
            saida.add(estudante.getEstudante());
        }
        return saida;
    }
}


