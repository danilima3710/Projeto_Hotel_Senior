package projetohotel.rest.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import projetohotel.rest.api.Model.CheckIn.Estruturas.FiltroFazerCheckIn;
import projetohotel.rest.api.Model.CheckIn.Estruturas.RetornoCheckIn;
import projetohotel.rest.api.Model.CheckIn.Funcoes.CheckInFuncoes;
import projetohotel.rest.api.Model.Hospede.Estruturas.FiltroHospede;
import projetohotel.rest.api.Model.Hospede.Estruturas.FiltroHospedeAtualizar;
import projetohotel.rest.api.Model.Hospede.Estruturas.Hospede;
import projetohotel.rest.api.Model.Hospede.Funcoes.HospedeFuncoes;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    CheckInFuncoes checkInFuncoes;

    @Autowired
    HospedeFuncoes hospedeFuncoes;

    @PostMapping(path = "/hotel/GravaHospede")
    public void GravaHospede(@RequestBody Hospede hospede){
        hospedeFuncoes.Grava(hospede);
    }

    @GetMapping(path = "/hotel/BuscaHospedes")
    public List<Hospede> BuscaHospedes(){
        return hospedeFuncoes.BuscaTodosHospedes();
    }

    @GetMapping(path = "/hotel/BuscaHospedeFiltro")
    public Hospede BuscaHospedeFiltro(@RequestBody FiltroHospede filtro){
        return hospedeFuncoes.BuscaHospede(filtro);
    }

    @PostMapping(path = "/hotel/AtualizaHospede")
    public void AtualizaHospede(@RequestBody FiltroHospedeAtualizar filtroAtualizar){
        hospedeFuncoes.AtualizaHospede(filtroAtualizar);
    }

    @PostMapping(path = "/hotel/DeletarHospede")
    public void DeletarHospede(@RequestBody FiltroHospede filtro){
        hospedeFuncoes.DeletarHospede(filtro);
    }

    @PostMapping(path = "/hotel/FazerCheckIn")
    public void FazerCheckIn(@RequestBody FiltroFazerCheckIn filtroCheckIn){
        checkInFuncoes.FazerCheckIn(filtroCheckIn);
    }

    @GetMapping(path = "/hotel/HospedesNoHotel")
    public List<RetornoCheckIn> BuscaHospedesNoHotel(){
        return checkInFuncoes.BuscaHospedesNoHotel();
    }

    @GetMapping(path = "/hotel/HospedesForaHotel")
    public List<RetornoCheckIn> BuscaHospedesForaHotel(){
        return checkInFuncoes.BuscaHospedesForaHotel();
    }
}
