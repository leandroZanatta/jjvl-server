package br.com.jjvl.entregas.repository.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_estados")
@Data
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_estado")
	private Long id;

	@Column(name = "tx_descricao")
	private String descricao;

	@Column(name = "tx_uf")
	private String uf;

	@OneToMany(mappedBy = "estado")
	private List<Cidade> cidades;

}