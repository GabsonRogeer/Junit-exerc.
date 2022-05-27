package one.digitalinnovation.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ContaTest {

    private String nome;

    private LocalDateTime nascimento;

    public ContaTest(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
}
