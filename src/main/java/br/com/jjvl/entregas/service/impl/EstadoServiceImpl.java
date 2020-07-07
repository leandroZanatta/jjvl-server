package br.com.jjvl.entregas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.jjvl.entregas.dto.EstadoDTO;
import br.com.jjvl.entregas.repository.EstadoRepository;
import br.com.jjvl.entregas.service.EstadoService;
import br.com.jjvl.entregas.util.ModelMapperUtil;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	@Lazy
	private EstadoRepository estadoRepository;

	@Override
	public List<EstadoDTO> obterTodos() {

		return ModelMapperUtil.list(estadoRepository.findAll(), EstadoDTO.class);
	}

}
