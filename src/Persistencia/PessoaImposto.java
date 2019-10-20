package Persistencia;

import java.math.BigDecimal;

public class PessoaImposto {
    private String nome;
    private String CPF;
    private int idade;
    private int numeroDependentes;
    private BigDecimal contribuicaoPrevidenciariaOficial;
    private BigDecimal totalRendimentos;
    private BigDecimal valorAPagar;

    public PessoaImposto(String nome, String CPF, int idade, int numeroDependentes, BigDecimal contribuicaoPrevidenciariaOficial, BigDecimal totalRendimentos, BigDecimal valorAPagar) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.numeroDependentes = numeroDependentes;
        this.contribuicaoPrevidenciariaOficial = contribuicaoPrevidenciariaOficial;
        this.totalRendimentos = totalRendimentos;
        this.valorAPagar = valorAPagar;
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

    public BigDecimal getValorAPagar() {
        return this.valorAPagar;
    }

    @Override
    public String toString() {
        return "PessoaImposto{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", idade=" + idade +
                ", numeroDependentes=" + numeroDependentes +
                ", contribuicaoPrevidenciariaOficial=" + contribuicaoPrevidenciariaOficial +
                ", totalRendimentos=" + totalRendimentos +
                ", valorAPagar=" + valorAPagar +
                '}';
    }
}
