package Interface.Controller;

import Interface.Main;
import Persistencia.PessoaImposto;
import Sistema.CalculaImposto;
import Sistema.PessoaFisica;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import javax.swing.*;

import java.math.BigDecimal;

import static Persistencia.RelacaoDePessoas.adicionar;


public class CompletoController {

    public TextField nome;
    public TextField idade;
    public TextField cpf;
    public TextField dependentes;
    public TextField contrOficial;
    public TextField totalRendimentos;
    public Button enviar;

    public Main main = new Main();


    @FXML
    public void initialize() {

    }

    public void clicarEnviar()throws Exception{
        if(nome.getText().isEmpty()||idade.getText().isEmpty()||cpf.getText().isEmpty()||dependentes.getText().isEmpty()||contrOficial.getText().isEmpty()||totalRendimentos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o formulario corretamente.");

        }else{

            PessoaFisica p = new PessoaFisica(nome.getText(),cpf.getText(),Integer.parseInt(idade.getText()),Integer.parseInt(dependentes.getText()), new BigDecimal(contrOficial.getText()),new BigDecimal(totalRendimentos.getText()));
            CalculaImposto calcula = new CalculaImposto(p);
            PessoaImposto pessoa = new PessoaImposto(p.getNome(),p.getCPF(),p.getIdade(),p.getNumeroDependentes(),p.getContribuicaoPrevidenciariaOficial(),p.getTotalRendimentos(),calcula.calculoCompleto());

            if (adicionar(pessoa)) {

                JOptionPane.showMessageDialog(null,"Calculo realizado com sucesso!");
                main.loadScene("FXML/TelaInicial.fxml", "Bem Vindo");
            } else {
                JOptionPane.showMessageDialog(null,"Erro ao calcular.");
                main.loadScene("FXMl/Completo", "Calculo Completo");
            }
        }
    }


}
