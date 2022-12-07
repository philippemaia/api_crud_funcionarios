package funcionarios.api.crudFuncionarios.dto;

import funcionarios.api.crudFuncionarios.entity.Endereco;
import funcionarios.api.crudFuncionarios.entity.Funcionario;

public record ListagemFuncionariosDTO(Long id, String nome, String email, Endereco endereco) {

    public ListagemFuncionariosDTO(Funcionario funcionario){
        this(funcionario.getId(), funcionario.getNome(), funcionario.getEmail(), funcionario.getEndereco());
    }
}
