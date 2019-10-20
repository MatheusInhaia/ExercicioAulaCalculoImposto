package Interface.Controller;

import Interface.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;



public class TelaInicialController {

    public Pane telainicial;
    public Button completo;
    public Button simplificado;
    public Button visualizar;

    public Main main = new Main();


    @FXML
    public void initialize() {
    }

    public void clicarCompleto()throws Exception{
        main.loadScene("FXML/completo.fxml","Calculo completo");
    }

    public void clicarSimplificado()throws Exception{
        main.loadScene("FXML/Simplificado.fxml","Calculo simplificado");
    }

    public void clicarVisualizar()throws Exception{
        main.loadScene("FXML/VisualizarPessoas.fxml","Lista de pessoas");
    }

}
