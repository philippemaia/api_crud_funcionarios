package funcionarios.api.crudFuncionarios.repository;

import funcionarios.api.crudFuncionarios.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
