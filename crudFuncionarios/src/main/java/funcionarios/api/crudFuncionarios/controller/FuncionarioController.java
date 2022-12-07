package funcionarios.api.crudFuncionarios.controller;

import funcionarios.api.crudFuncionarios.dto.CadastroFuncionarioDTO;
import funcionarios.api.crudFuncionarios.entity.Funcionario;
import funcionarios.api.crudFuncionarios.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroFuncionarioDTO dto){
        repository.save(new Funcionario(dto));
    }

}
