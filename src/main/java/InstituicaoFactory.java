import java.util.HashMap;
import java.util.Map;

public class InstituicaoFactory {
    private static Map<String, Instituicao> instituicoes = new HashMap<>();

    public static Instituicao getInstituicao(String nome, String sigla) {
        Instituicao instituicao = instituicoes.get(nome);
        if (instituicao == null) {
            instituicao = new Instituicao(nome, sigla);
            instituicoes.put(nome, instituicao);
        }
        return instituicao;
    }

    public static int getTotalInstituicoes(){
        return instituicoes.size();
    }
}
