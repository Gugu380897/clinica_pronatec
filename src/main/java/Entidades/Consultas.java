/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Jonas Pereira
 */
public class Consultas {
    int idConsulta;
    int idPaciente;
    int idDoctor;
    String data;
    String hora;
    private String Nome_Medicos;
    private String Nome_pacientes;

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idAgenda) {
        this.idConsulta = idAgenda;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the Nome_Medicos
     */
    public String getNome_Medicos() {
        return Nome_Medicos;
    }

    /**
     * @param Nome_Medicos the Nome_Medicos to set
     */
    public void setNome_Medicos(String Nome_Medicos) {
        this.Nome_Medicos = Nome_Medicos;
    }

    /**
     * @return the Nome_pacientes
     */
    public String getNome_pacientes() {
        return Nome_pacientes;
    }

    /**
     * @param Nome_pacientes the Nome_pacientes to set
     */
    public void setNome_pacientes(String Nome_pacientes) {
        this.Nome_pacientes = Nome_pacientes;
    }

    public void setNomeMed(String nomeMedico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNomePac(String nomePaciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
