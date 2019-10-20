package Sistema;

import java.math.BigDecimal;
import java.util.Date;

public class PessoaFisica {
    private String nome;
    private String CPF;
    private int idade;
    private int numeroDependentes;
    private BigDecimal contribuicaoPrevidenciariaOficial;
    private BigDecimal totalRendimentos;

    public PessoaFisica(String nome, String CPF, int idade, int numeroDependentes,BigDecimal contribuicaoPrevidenciariaOficial, BigDecimal totalRendimentos){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.numeroDependentes = numeroDependentes;
        this.contribuicaoPrevidenciariaOficial = contribuicaoPrevidenciariaOficial;
        this.totalRendimentos = totalRendimentos;
    }

    public PessoaFisica(String nome, String CPF, BigDecimal contribuicaoPrevidenciariaOficial, BigDecimal totalRendimentos) {
        this.nome = nome;
        this.CPF = CPF;
        this.contribuicaoPrevidenciariaOficial = contribuicaoPrevidenciariaOficial;
        this.totalRendimentos = totalRendimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }


    public BigDecimal getContribuicaoPrevidenciariaOficial() {
        return this.contribuicaoPrevidenciariaOficial;
    }

    public BigDecimal getTotalRendimentos() {
        return this.totalRendimentos;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", idade=" + idade +
                ", numeroDependentes=" + numeroDependentes +
                ", totalRendimentos=" + totalRendimentos +
                '}';
    }
}
