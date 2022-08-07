package projetohotel.rest.api.Model.CheckIn.Estruturas;

public class RetornoCheckIn {
    private String nome;
    private String telefone;
    private String documento;
    private float valorTotal;
    private float valorUltimaHospedagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorUltimaHospedagem() {
        return valorUltimaHospedagem;
    }

    public void setValorUltimaHospedagem(float valorUltimaHospedagem) {
        this.valorUltimaHospedagem = valorUltimaHospedagem;
    }
}
