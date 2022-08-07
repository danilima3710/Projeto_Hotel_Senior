package projetohotel.rest.api.Model.Hospede.Estruturas;

import javax.persistence.*;

@Entity(name = "hospede")
public class Hospede {

    public Hospede() {
    }

    public Hospede(Integer codigo, String nome, String numero, String documento) {
        this.codigo = codigo;
        this.nome = nome;
        this.numero = numero;
        this.documento = documento;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String documento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
