package projetohotel.rest.api.Model.Hospede.Estruturas;

public class FiltroHospede {
    private String nome;
    private String numero;
    private String documento;

    public FiltroHospede(String nome, String numero, String documento) {
        this.nome = nome;
        this.numero = numero;
        this.documento = documento;
    }

    public FiltroHospede()
    {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
