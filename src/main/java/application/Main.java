package application;

import dao.ConsultaDao;
import dao.ExameDao;
import dao.PacienteDao;
import dao.UsuarioDao;
import entities.Consulta;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import java.text.SimpleDateFormat;

public class Main extends Application {
    //convertendo as datas
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //criando objetos pra usar os comando sql que tem na classe dao
    private ConsultaDao consultaDao = new ConsultaDao();
    private PacienteDao pacienteDao = new PacienteDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private ExameDao exameDao = new ExameDao();

    private TextField txtIdConsulta, txtIdPaciente,txtIdSetor, txtCRM;
    private TextField txtDataHora, txtValor, txtTipo, txtStatus, txtObservacoes;
    private TableView<Consulta> tableConsulta;

    //ATRIBUTOS PACIENTE COLOCA PACIENTEID E NAO IDPACIENTE EM BAIXO COLOCA O TABLEVIEW

    //ATRIBUTOS USUARIO EM BAIXO COLOCA O TABLEVIEW

    //ATRIBUTOS EXAME EM BAIXO COLOCA O TABLEVIEW



    private Label lblStatusGlobal; //serve pra mostrar mensagens pro usuario na tela

    public void start(Stage primaryStage){
        primaryStage.setTitle("Clicica Médica"); //definindo o titulo da janela

        lblStatusGlobal = new Label("Status: Banco De Dados Conectado!"); //criando um texto na tela
        lblStatusGlobal.setText("O Sistema Foi Iniciado!"); //mudando o texto

        TabPane tabPane = new TabPane(); //criando o conjunto de abas, TabPane guarda todas as abas
        Tab tabConsulta = new Tab("Consultas", criaPainelConsultas()); //criando a aba chamada consulta
        Tab tabPaciente = new Tab("Pacientes", criarPainelPacientes());
        Tab tabUsuario = new Tab("Usuários", criarPainelUsuario());
        Tab tabExame = new Tab("Exames", criarPainelExames());

        tabConsulta.setClosable(false); //para impedir que o usuario feche a aba
        tabPaciente.setClosable(false);
        tabUsuario.setClosable(false);
        tabExame.setClosable(false);
        tabPane.getTabs().addAll(tabConsulta, tabPaciente,tabUsuario, tabExame); //adicionando as abas dentro do tabpane no conjunto

        VBox root = new VBox(10, tabPane, lblStatusGlobal); //Vbox organizador visual pra colocar os componentes um embaixo do outro, 10 é o espaço entre eles
        root.setPadding(new Insets(10));

        //informando a altura e largura da janela
        primaryStage.setScene(new Scene(root, 600, 650));
        primaryStage.show(); //pra exibir a janela
    }


    //metodo pra montar as abas
    private VBox criaPainelConsultas(){
        return new VBox();
    }

    private VBox criarPainelPacientes(){
        return new VBox();
    }

    private VBox criarPainelUsuario(){
        return new VBox();
    }

    private VBox criarPainelExames(){
        return new VBox();

    }



}