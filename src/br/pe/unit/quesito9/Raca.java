/**
 * 
 */
package br.pe.unit.quesito9;

/**
 * @author Andre
 *
 */
public class Raca {
	private int id;
	private String origem;
	private double tamanhoMax;
	private double tamanhoMin;
	private int expectativaDeVida;
	private int temperamento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getTamanhoMax() {
		return tamanhoMax;
	}

	public void setTamanhoMax(double tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}

	public double getTamanhoMin() {
		return tamanhoMin;
	}

	public void setTamanhoMin(double tamanhoMin) {
		this.tamanhoMin = tamanhoMin;
	}

	public int getExpectativaDeVida() {
		return expectativaDeVida;
	}

	public void setExpectativaDeVida(int expectativaDeVida) {
		this.expectativaDeVida = expectativaDeVida;
	}

	public int getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(int temperamento) {
		this.temperamento = temperamento;
	}
}
