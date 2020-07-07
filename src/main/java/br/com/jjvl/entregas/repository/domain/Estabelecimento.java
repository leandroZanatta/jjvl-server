package br.com.jjvl.entregas.repository.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_estabelecimento")
@SequenceGenerator(name = "GEN_ESTABELECIMENTO", sequenceName = "GEN_ESTABELECIMENTO", allocationSize = 1)
public class Estabelecimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_ESTABELECIMENTO")
	@Column(name = "id_estabelecimento")
	private Long id;

	@Column(name = "tx_nomefantasia")
	private String nomeFantasia;

	@Column(name = "cd_cidade")
	private Long codigoCidade;

	@Column(name = "tx_cnpj")
	private String numeroCnpj;

	@Column(name = "tx_endereco")
	private String endereco;

	@Column(name = "tx_bairro")
	private String bairro;

	@Column(name = "tx_numero")
	private String numero;

	@Column(name = "tx_senha")
	private String senha;

	@ManyToOne
	@JoinColumn(name = "cd_cidade", insertable = false, updatable = false)
	private Cidade cidade;

}