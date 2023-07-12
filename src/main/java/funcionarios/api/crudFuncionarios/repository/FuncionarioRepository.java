package funcionarios.api.crudFuncionarios.repository;

import funcionarios.api.crudFuncionarios.entity.Funcionario;
import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Page<Funcionario> findAllByAtivoTrue(Pageable paginacao);
}
