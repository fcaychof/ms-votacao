package br.com.votacao.controller;

import br.com.votacao.domain.VotacaoDto;
import br.com.votacao.service.VotacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VotacaoController {

	private final VotacaoService votacaoService;
	@GetMapping("v1/pautas/{id}/votacao")
	@ResponseStatus(code = HttpStatus.OK)
	public VotacaoDto findVotosByPautaId(@PathVariable Long id) {
		return votacaoService.getResultVotacao(id);
	}
}
