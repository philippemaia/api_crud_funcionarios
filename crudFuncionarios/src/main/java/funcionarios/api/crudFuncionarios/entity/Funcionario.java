package funcionarios.api.crudFuncionarios.entity;

import funcionarios.api.crudFuncionarios.dto.CadastroFuncionarioDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Funcionario")
@Table(name = "funcionarios")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Funcionario(CadastroFuncionarioDTO dto) {
        this.ativo = true;
        this.nome = dto.nome();
        this.email =dto.email();
        this.telefone = dto.telefone();
        this.endereco = new Endereco(dto.endereco());
    }

}
