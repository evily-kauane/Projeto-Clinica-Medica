package entities;

import java.time.LocalDateTime;

public class Consulta {
    private int id_consulta; //cada consulta tem um indentificado unico
    private int id_paciente; //para guardar o id do paciente que realizou a consulta
    private String crm_do_medico; //para guardar o crm do medico responsavel pela consulta
    private int id_setor; //para guardar o setor da clinica que vai fazer a consulta
    private LocalDateTime data_e_hora; //para guardar a hr e dta da consulta
    private double valor_da_consulta;
    private String tipo_de_urgencia; //se é vermelho,amarelo, ou verde
    private String status_da_consulta; //se ta ahendada, se ja foi realizada ou cancelada
    private String observaçoes_sobre_consulta;

    public Consulta(){
        //construtor vazio pra criar um objeto sem nada, pra se quiser colocar alguma coisa dps
    }

    public Consulta(int id_paciente, String crm_do_medico, int id_setor, LocalDateTime data_e_hora,
                    double valor_da_consulta, String tipo_de_urgencia, String status_da_consulta, String observaçoes_sobre_consulta){
        //construtor que já recebe os dados completos
        this.id_paciente = id_paciente;
        this.crm_do_medico = crm_do_medico;
        this.id_setor = id_setor;
        this.data_e_hora = data_e_hora;
        this.valor_da_consulta = valor_da_consulta;
        this.tipo_de_urgencia = tipo_de_urgencia;
        this.status_da_consulta = status_da_consulta;
        this.observaçoes_sobre_consulta = observaçoes_sobre_consulta;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getCrm_do_medico() {
        return crm_do_medico;
    }

    public void setCrm_do_medico(String crm_do_medico) {
        this.crm_do_medico = crm_do_medico;
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }

    public LocalDateTime getData_e_hora() {
        return data_e_hora;
    }

    public void setData_e_hora(LocalDateTime data_e_hora) {
        this.data_e_hora = data_e_hora;
    }

    public double getValor_da_consulta() {
        return valor_da_consulta;
    }

    public void setValor_da_consulta(double valor_da_consulta) {
        this.valor_da_consulta = valor_da_consulta;
    }

    public String getTipo_de_urgencia() {
        return tipo_de_urgencia;
    }

    public void setTipo_de_urgencia(String tipo_de_urgencia) {
        this.tipo_de_urgencia = tipo_de_urgencia;
    }

    public String getStatus_da_consulta() {
        return status_da_consulta;
    }

    public void setStatus_da_consulta(String status_da_consulta) {
        this.status_da_consulta = status_da_consulta;
    }

    public String getObservaçoes_sobre_consulta() {
        return observaçoes_sobre_consulta;
    }

    public void setObservaçoes_sobre_consulta(String observaçoes_sobre_consulta) {
        this.observaçoes_sobre_consulta = observaçoes_sobre_consulta;
    }
}
