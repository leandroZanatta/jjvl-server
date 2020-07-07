package br.com.jjvl.entregas.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jjvl.entregas.dto.EstadoDTO;
import br.com.jjvl.entregas.service.EstadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/estados", produces = { MediaType.APPLICATION_JSON_VALUE })
@Api(tags = { "Estados" })
public class EstadoController {

	@Autowired
	private EstadoService estadoService;

	@GetMapping("/")
	@ApiOperation(value = "Buscar todos estados", response = EstadoDTO.class)
	public List<EstadoDTO> obterTodos() {

		return estadoService.obterTodos();
	}
}
