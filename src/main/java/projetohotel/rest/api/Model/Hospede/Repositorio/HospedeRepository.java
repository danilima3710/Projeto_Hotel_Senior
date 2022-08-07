package projetohotel.rest.api.Model.Hospede.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetohotel.rest.api.Model.Hospede.Estruturas.Hospede;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Integer> {
}
