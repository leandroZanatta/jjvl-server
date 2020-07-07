package br.com.jjvl.entregas.repository.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_cidades")
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_cidade")
	private Long id;

	@Column(name = "tx_descricao")
	private String descricao;

	@Column(name = "cd_estado", insertable = false, updatable = false)
	private Long codigoEstado;

	@ManyToOne
	@JoinColumn(name = "cd_estado")
	private Estado estado;

	@OneToMany(mappedBy = "cidade")
	private List<Estabelecimento> estabelecimentos;

}