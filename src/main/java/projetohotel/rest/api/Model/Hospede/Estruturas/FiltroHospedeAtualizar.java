package projetohotel.rest.api.Model.Hospede.Estruturas;

public class FiltroHospedeAtualizar {
    private String nomeFiltro;
    private String numeroFiltro;
    private String documentoFiltro;

    private String nomeHospede;
    private String numeroHospede;
    private String documentoHospede;

    public String getNomeFiltro() {
        return nomeFiltro;
    }

    public void setNomeFiltro(String nomeFiltro) {
        this.nomeFiltro = nomeFiltro;
    }

    public String getNumeroFiltro() {
        return numeroFiltro;
    }

    public void setNumeroFiltro(String numeroFiltro) {
        this.numeroFiltro = numeroFiltro;
    }

    public String getDocumentoFiltro() {
        return documentoFiltro;
    }

    public void setDocumentoFiltro(String documentoFiltro) {
        this.documentoFiltro = documentoFiltro;
    }

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
}
