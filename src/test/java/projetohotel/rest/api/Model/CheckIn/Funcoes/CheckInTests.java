package projetohotel.rest.api.Model.CheckIn.Funcoes;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import projetohotel.rest.api.Model.CheckIn.Funcoes.CheckInFuncoes;
import projetohotel.rest.api.Model.Hospede.Estruturas.Hospede;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class CheckInTests {

	CheckInFuncoes ch = new CheckInFuncoes();

	@Test
	void contextLoads() {
	}

	@Test
	//Teste calculo padrao
	void TestCalculoPadrao(){
		LocalDateTime dataHoraEntrada = LocalDateTime.of(2022, 8, 4, 8, 0);
		LocalDateTime dataHoraSaida = LocalDateTime.of(2022, 8, 7, 10,30);

		float valorResultado = ch.CalculaValorHospedagem(dataHoraEntrada, dataHoraSaida, true);

		Assert.isTrue(valorResultado == 610.00, "Resultado incorreto para a chamada da funcao CalculaValorHospedagem");
	}

	@Test
	void TestaCalculoHoraAdicionalFinalSemana(){
		LocalDateTime dataHoraEntrada = LocalDateTime.of(2022, 8, 4, 8, 0);
		LocalDateTime dataHoraSaida = LocalDateTime.of(2022, 8, 7, 17,00);

		float valorResultado = ch.CalculaValorHospedagem(dataHoraEntrada, dataHoraSaida, true);

		Assert.isTrue(valorResultado == 780.00, "Resultado incorreto para a chamada da funcao CalculaValorHospedagem");
	}

	@Test
	void TestaCalculoHoraAdicionalDaSemana(){
		LocalDateTime dataHoraEntrada = LocalDateTime.of(2022, 8, 4, 8, 0);
		LocalDateTime dataHoraSaida = LocalDateTime.of(2022, 8, 5, 17,00);

		float valorResultado = ch.CalculaValorHospedagem(dataHoraEntrada, dataHoraSaida, true);

		Assert.isTrue(valorResultado == 405.00, "Resultado incorreto para a chamada da funcao CalculaValorHospedagem");
	}

	@Test
	void TestaDataEhFinalDeSemana(){
		LocalDate data = LocalDate.of(2022, 8, 6);

		boolean ehFinalSemana = ch.DataEhFinalDeSemana(data);

		Assert.isTrue(ehFinalSemana, "Resultado incorreto para a chamada da funcao TestaDataEhFinalDeSemana");
	}

	@Test
	void TestaDataEhDiaDeSemana(){
		LocalDate data = LocalDate.of(2022, 8, 5);

		boolean ehFinalSemana = ch.DataEhFinalDeSemana(data);

		Assert.isTrue(ehFinalSemana == false, "Resultado incorreto para a chamada da funcao TestaDataEhFinalDeSemana");
	}

	@Test
	void TestaConversaoStringToLocalDateTime(){
		LocalDateTime data = LocalDateTime.of(2018, 3, 14, 8,0);

		LocalDateTime dataHora = ch.StringToLocalDateTime("2018-03-14T08:00:00");

		Assert.isTrue(data.equals(dataHora), "Resultado incorreto para a chamada da funcao StringToLocalDateTime");
	}

	@Test
	void TestaAindaEstaNoHotelPadrao(){
		LocalDateTime data = LocalDateTime.of(2018, 3, 14, 8,0);

		Assert.isTrue(ch.AindaEstaNoHotel(data) == false, "Resultado incorreto para a chamada da funcao AindaEstaNoHotel");
	}

	@Test
	void TestaAindaEstaNoHotelDataPosterior(){
		LocalDateTime data = LocalDateTime.now().plusDays(2);

		Assert.isTrue(ch.AindaEstaNoHotel(data), "Resultado incorreto para a chamada da funcao AindaEstaNoHotel");
	}
}
