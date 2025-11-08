package com.br.pbpostodecombustivel.api.pessoa;
import com.br.pbpostodecombustivel.domain.dto.PessoaRequest;
import com.br.pbpostodecombustivel.domain.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }


    public List<PessoaResponse> listarTodos() {
        return List.of();
    }

    public PessoaResponse create(PessoaRequest req) {
        return null;
    }
}
