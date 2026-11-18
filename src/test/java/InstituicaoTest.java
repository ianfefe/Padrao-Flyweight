import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InstituicaoTest {

    @Test
    void deveRetornarEstudantes() {
        Assinatura assinatura = new Assinatura();
        assinatura.assinar("Ian", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Pedro", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Bernardo", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Mariana", "Universidade Federal de Viçosa", "UFV");

        List<String> saida = Arrays.asList(
                "Estudante{nome='Ian', instituicao='Universidade Federal de Juiz de Fora', sigla='UFJF'}",
                "Estudante{nome='Pedro', instituicao='Universidade Federal de Juiz de Fora', sigla='UFJF'}",
                "Estudante{nome='Bernardo', instituicao='Universidade Federal de Juiz de Fora', sigla='UFJF'}",
                "Estudante{nome='Mariana', instituicao='Universidade Federal de Viçosa', sigla='UFV'}");

        assertEquals(saida, assinatura.obterEstudantes());
    }

    @Test
    void deveRetornarTotalCidades() {
        Assinatura assinatura = new Assinatura();
        assinatura.assinar("Ian", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Pedro", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Bernardo", "Universidade Federal de Juiz de Fora", "UFJF");
        assinatura.assinar("Mariana", "Universidade Federal de Viçosa", "UFV");

        assertEquals(2, InstituicaoFactory.getTotalInstituicoes());
    }

}