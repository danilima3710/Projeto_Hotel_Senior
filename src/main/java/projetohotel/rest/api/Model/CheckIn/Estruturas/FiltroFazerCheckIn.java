package projetohotel.rest.api.Model.CheckIn.Estruturas;

import java.sql.Date;

public class FiltroFazerCheckIn {
    private String nomeHospede;
    private String numeroHospede;
    private String documentoHospede;

    private String dataEntrada;
    private String dataSaida;
    private boolean adicionalVeiculo;

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getNumeroHospede() {
        return numeroHospede;
    }

    public void setNumeroHospede(String numeroHospede) {
        this.numeroHospede = numeroHospede;
    }

    public String getDocumentoHospede() {
        return documentoHospede;
    }

    public void setDocumentoHospede(String documentoHospede) {
        this.documentoHospede = documentoHospede;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public boolean getAdicionalVeiculo() {
        return adicionalVeiculo;
    }

    public void setAdicionalVeiculo(boolean adicionalVeiculo) {
        this.adicionalVeiculo = adicionalVeiculo;
    }
}
