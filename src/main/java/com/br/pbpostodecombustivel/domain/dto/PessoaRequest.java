package com.br.pbpostodecombustivel.domain.dto;

import com.br.pbpostodecombustivel.enums.TipoPessoa;

import java.time.LocalDate;

public record PessoaRequest(
        String nomeCompleto,
        String cpfCnpj,
        Long numeroCtps,
        LocalDate dataNascimento,
        TipoPessoa tipoPessoa
) {
}