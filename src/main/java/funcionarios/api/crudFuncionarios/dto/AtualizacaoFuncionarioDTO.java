package funcionarios.api.crudFuncionarios.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoFuncionarioDTO(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone,
        EnderecoDTO endereco
) {
}
