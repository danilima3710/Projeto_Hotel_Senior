package projetohotel.rest.api.Model.CheckIn.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetohotel.rest.api.Model.CheckIn.Estruturas.CheckIn;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
