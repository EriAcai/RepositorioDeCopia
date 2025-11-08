package com.br.pbpostodecombustivel.api.pessoa;

import com.br.pbpostodecombustivel.domain.dto.PessoaRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PessoaResponse> listar () {
        return service.listarTodos();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaResponse create(@RequestBody PessoaRequest req) {
        return service.create(req);
    }
}