package br.com.jjvl.entregas.service;

import java.util.List;

import br.com.jjvl.entregas.dto.EstadoDTO;

@FunctionalInterface
public interface EstadoService {

	public abstract List<EstadoDTO> obterTodos();
}
