package Interface.Controller;

import Interface.Main;
import Persistencia.PessoaImposto;
import Persistencia.PessoaImpostoGenerica;
import Persistencia.RelacaoDePessoas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;

import java.math.BigDecimal;

import static Persistencia.RelacaoDePessoas.listarContas;

public class VisualizarPessoasController {

    public TableView<PessoaImpostoGenerica> tabela;
    public TableColumn<PessoaImposto, String> Tnome;
    public TableColumn<PessoaImposto, String> Tcpf;
    public TableColumn<PessoaImposto, Integer> Tidade;
    public TableColumn<PessoaImposto, Integer> Tdep;
    public TableColumn<PessoaImposto, BigDecimal> Tcontr;
    public TableColumn<PessoaImposto, BigDecimal> TRendimentos;
    public TableColumn<PessoaImposto, BigDecimal> Tvalor;



    public Button voltar;

    public Main main = new Main();
    public void clicarVoltar()throws Exception{
        main.loadScene("FXML/TelaInicial.fxml","Bem Vindo");
    }
    private ObservableList<PessoaImpostoGenerica> listaDeClientes() {
        ObservableList<PessoaImpostoGenerica> pessoas = FXCollections.observableArrayList();
        for(PessoaImposto p: RelacaoDePessoas.listarContas()){
            pessoas.add(new PessoaImpostoGenerica(p));
        }
        return pessoas;
    }

    public void initialize(){
        Tnome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
        Tcpf.setCellValueFactory(new PropertyValueFactory<>("Cpf"));
        Tidade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        Tdep.setCellValueFactory(new PropertyValueFactory<>("Dependentes"));
        Tcontr.setCellValueFactory(new PropertyValueFactory<>("Contribuição oficial"));
        TRendimentos.setCellValueFactory(new PropertyValueFactory<>("Total de rendimentos"));
        Tvalor.setCellValueFactory(new PropertyValueFactory<>("valor a pagar"));
        tabela.setItems(listaDeClientes());
    }
}
