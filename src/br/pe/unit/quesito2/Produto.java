/**
 * 
 */
package br.pe.unit.quesito2;

import java.util.Date;

/**
 * @author Andre
 *
 */
public class Produto {

	private Integer id;
	private String nome;
	private String descricao;
	private Date validade;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	/**
	 * 
	 * @return o id
	 */
	public Integer getCod() {
		return this.getId();
	}
}
