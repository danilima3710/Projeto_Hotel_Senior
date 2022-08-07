package projetohotel.rest.api.Model.CheckIn.Estruturas;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity(name = "checkIn")
public class CheckIn {
    public CheckIn(){
    }
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false)
    private Integer codigoHospede;

    @Column(nullable = false)
    private String dataHoraEntrada;

    @Column(nullable = false)
    private String dataHoraSaida;

    @Column(nullable = false)
    private boolean adicionalVeiculo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigoHospede() {
        return codigoHospede;
    }

    public void setCodigoHospede(Integer codigoHospede) {
        this.codigoHospede = codigoHospede;
    }

    public String getDataEntrada() {
        return dataHoraEntrada;
    }

    public void setDataEntrada(String dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public String getDataSaida() {
        return dataHoraSaida;
    }

    public void setDataSaida(String dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public boolean isAdicionalVeiculo() {
        return adicionalVeiculo;
    }

    public void setAdicionalVeiculo(boolean adicionalVeiculo) {
        this.adicionalVeiculo = adicionalVeiculo;
    }
}
