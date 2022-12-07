package funcionarios.api.crudFuncionarios.controller;

import funcionarios.api.crudFuncionarios.dto.AtualizacaoFuncionarioDTO;
import funcionarios.api.crudFuncionarios.dto.CadastroFuncionarioDTO;
import funcionarios.api.crudFuncionarios.dto.ListagemFuncionariosDTO;
import funcionarios.api.crudFuncionarios.entity.Funcionario;
import funcionarios.api.crudFuncionarios.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<ListagemFuncionariosDTO> consultar(@PageableDefault(size = 10, page = 0, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListagemFuncionariosDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizacaoFuncionarioDTO dto){
        Funcionario funcionario = repository.getReferenceById(dto.id());
        funcionario.atualizarInformacoes(dto);
    }

}
