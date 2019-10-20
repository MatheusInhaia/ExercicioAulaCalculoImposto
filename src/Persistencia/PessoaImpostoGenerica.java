package Persistencia;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.math.BigDecimal;

public class PessoaImpostoGenerica {
    private SimpleStringProperty nome;
    private SimpleStringProperty cpf;
    private SimpleIntegerProperty idade;
    private SimpleIntegerProperty dependentes;
    private SimpleStringProperty contr;
    private SimpleStringProperty totalRendimentos;
    private SimpleStringProperty valor;


    public PessoaImpostoGenerica(PessoaImposto pessoa){
        this.nome = new SimpleStringProperty(pessoa.getNome());
        this.cpf = new SimpleStringProperty(pessoa.getCPF());
        this.idade = new SimpleIntegerProperty(pessoa.getIdade());
        this.dependentes= new SimpleIntegerProperty(pessoa.getNumeroDependentes());
        this.contr = new SimpleStringProperty(pessoa.getContribuicaoPrevidenciariaOficial().toString());
        this.totalRendimentos = new SimpleStringProperty(pessoa.getTotalRendimentos().toString());
        this.valor = new SimpleStringProperty(pessoa.getValorAPagar().toString());
    }

    public String getNome() {
        return nome.get();
    }

    public String getCpf() {
        return cpf.get();
    }

    public int getIdade() {
        return idade.getValue();
    }

    public int getDependentes() {
        return dependentes.getValue();
    }

    public String getContr() {
        return contr.getValue();
    }

    public String getTotalRendimentos() {
        return totalRendimentos.getValue();
    }

    public String getValor() {
        return valor.getValue();
    }


}
