package br.com.camarao.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Camarao {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_CAMARAO")
	@SequenceGenerator(name = "ID_CAMARAO", sequenceName = "SEQ_ID_CAMARAO", allocationSize = 1)
	private Integer id;

	@Column(name = "salinidade_superficie", columnDefinition = "NUMERIC(6,1)")
	private float salinidadeSuperficie;

	@Column(name = "salinidade_fundo", columnDefinition = "NUMERIC(6,1)")
	private float salinidadeFundo;

	@Column(columnDefinition = "NUMERIC(6,1)")
	private float temperatura;

	@Column(columnDefinition = "NUMERIC(6,2)")
	private float transparencia;

	@Column(name = "materia_organica", columnDefinition = "NUMERIC(6,1)")
	private float materiaOrganica;

	@Column(name = "oxigenio_dissolvido", columnDefinition = "NUMERIC(6,2)")
	private float oxigenioDissolvido;

	@Column(columnDefinition = "NUMERIC(6,1)")
	private float ph;

	@Column(name = "alcalinidade_doce", columnDefinition = "NUMERIC(6,1)")
	private float alcalinidadeDoce;

	@Column(name = "alcalinidade_salobra", columnDefinition = "NUMERIC(6,1)")
	private float alcalinidadeSalobra;

	@Column(name = "dureza_total_doce", columnDefinition = "NUMERIC(6,1)")
	private float durezaTotalDoce;

	@Column(name = "dureza_total_salobra", columnDefinition = "NUMERIC(6,1)")
	private float durezaTotalSalobra;

	@Column(name = "amonia_total", columnDefinition = "NUMERIC(6,2)")
	private float amoniaTotal;

	@Column(name = "nitrito_doce", columnDefinition = "NUMERIC(6,2)")
	private float nitritoDoce;

	@Column(name = "nitrito_salobra", columnDefinition = "NUMERIC(6,1)")
	private float nitritoSalobra;

	@Column(name = "nitrato_doce", columnDefinition = "NUMERIC(6,1)")
	private float nitratoDoce;

	@Column(name = "nitrato_salobra", columnDefinition = "NUMERIC(6,1)")
	private float nitratoSalobra;

	@Column(columnDefinition = "NUMERIC(6,2)")
	private float h2s;

	@Column(columnDefinition = "NUMERIC(6,1)")
	private float silicato;

	private LocalDateTime medicao;

	public Camarao() {
		super();
	}

	public Camarao(float salinidadeSuperficie, float salinidadeFundo, float temperatura, float transparencia,
			float materiaOrganica, float oxigenioDissolvido, float ph, float alcalinidadeDoce,
			float alcalinidadeSalobra, float durezaTotalDoce, float durezaTotalSalobra, float amoniaTotal,
			float nitritoDoce, float nitritoSalobra, float nitratoDoce, float nitratoSalobra, float h2s, float silicato,
			LocalDateTime medicao) {
		super();
		this.salinidadeSuperficie = salinidadeSuperficie;
		this.salinidadeFundo = salinidadeFundo;
		this.temperatura = temperatura;
		this.transparencia = transparencia;
		this.materiaOrganica = materiaOrganica;
		this.oxigenioDissolvido = oxigenioDissolvido;
		this.ph = ph;
		this.alcalinidadeDoce = alcalinidadeDoce;
		this.alcalinidadeSalobra = alcalinidadeSalobra;
		this.durezaTotalDoce = durezaTotalDoce;
		this.durezaTotalSalobra = durezaTotalSalobra;
		this.amoniaTotal = amoniaTotal;
		this.nitritoDoce = nitritoDoce;
		this.nitritoSalobra = nitritoSalobra;
		this.nitratoDoce = nitratoDoce;
		this.nitratoSalobra = nitratoSalobra;
		this.h2s = h2s;
		this.silicato = silicato;
		this.medicao = medicao;
	}

	public Camarao(Integer id, float salinidadeSuperficie, float salinidadeFundo, float temperatura,
			float transparencia, float materiaOrganica, float oxigenioDissolvido, float ph, float alcalinidadeDoce,
			float alcalinidadeSalobra, float durezaTotalDoce, float durezaTotalSalobra, float amoniaTotal,
			float nitritoDoce, float nitritoSalobra, float nitratoDoce, float nitratoSalobra, float h2s, float silicato,
			LocalDateTime medicao) {
		super();
		this.id = id;
		this.salinidadeSuperficie = salinidadeSuperficie;
		this.salinidadeFundo = salinidadeFundo;
		this.temperatura = temperatura;
		this.transparencia = transparencia;
		this.materiaOrganica = materiaOrganica;
		this.oxigenioDissolvido = oxigenioDissolvido;
		this.ph = ph;
		this.alcalinidadeDoce = alcalinidadeDoce;
		this.alcalinidadeSalobra = alcalinidadeSalobra;
		this.durezaTotalDoce = durezaTotalDoce;
		this.durezaTotalSalobra = durezaTotalSalobra;
		this.amoniaTotal = amoniaTotal;
		this.nitritoDoce = nitritoDoce;
		this.nitritoSalobra = nitritoSalobra;
		this.nitratoDoce = nitratoDoce;
		this.nitratoSalobra = nitratoSalobra;
		this.h2s = h2s;
		this.silicato = silicato;
		this.medicao = medicao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getSalinidadeSuperficie() {
		return salinidadeSuperficie;
	}

	public void setSalinidadeSuperficie(float salinidadeSuperficie) {
		this.salinidadeSuperficie = salinidadeSuperficie;
	}

	public float getSalinidadeFundo() {
		return salinidadeFundo;
	}

	public void setSalinidadeFundo(float salinidadeFundo) {
		this.salinidadeFundo = salinidadeFundo;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getTransparencia() {
		return transparencia;
	}

	public void setTransparencia(float transparencia) {
		this.transparencia = transparencia;
	}

	public float getMateriaOrganica() {
		return materiaOrganica;
	}

	public void setMateriaOrganica(float materiaOrganica) {
		this.materiaOrganica = materiaOrganica;
	}

	public float getOxigenioDissolvido() {
		return oxigenioDissolvido;
	}

	public void setOxigenioDissolvido(float oxigenioDissolvido) {
		this.oxigenioDissolvido = oxigenioDissolvido;
	}

	public float getPh() {
		return ph;
	}

	public void setPh(float ph) {
		this.ph = ph;
	}

	public float getAlcalinidadeDoce() {
		return alcalinidadeDoce;
	}

	public void setAlcalinidadeDoce(float alcalinidadeDoce) {
		this.alcalinidadeDoce = alcalinidadeDoce;
	}

	public float getAlcalinidadeSalobra() {
		return alcalinidadeSalobra;
	}

	public void setAlcalinidadeSalobra(float alcalinidadeSalobra) {
		this.alcalinidadeSalobra = alcalinidadeSalobra;
	}

	public float getDurezaTotalDoce() {
		return durezaTotalDoce;
	}

	public void setDurezaTotalDoce(float durezaTotalDoce) {
		this.durezaTotalDoce = durezaTotalDoce;
	}

	public float getDurezaTotalSalobra() {
		return durezaTotalSalobra;
	}

	public void setDurezaTotalSalobra(float durezaTotalSalobra) {
		this.durezaTotalSalobra = durezaTotalSalobra;
	}

	public float getAmoniaTotal() {
		return amoniaTotal;
	}

	public void setAmoniaTotal(float amoniaTotal) {
		this.amoniaTotal = amoniaTotal;
	}

	public float getNitritoDoce() {
		return nitritoDoce;
	}

	public void setNitritoDoce(float nitritoDoce) {
		this.nitritoDoce = nitritoDoce;
	}

	public float getNitritoSalobra() {
		return nitritoSalobra;
	}

	public void setNitritoSalobra(float nitritoSalobra) {
		this.nitritoSalobra = nitritoSalobra;
	}

	public float getNitratoDoce() {
		return nitratoDoce;
	}

	public void setNitratoDoce(float nitratoDoce) {
		this.nitratoDoce = nitratoDoce;
	}

	public float getNitratoSalobra() {
		return nitratoSalobra;
	}

	public void setNitratoSalobra(float nitratoSalobra) {
		this.nitratoSalobra = nitratoSalobra;
	}

	public float getH2s() {
		return h2s;
	}

	public void setH2s(float h2s) {
		this.h2s = h2s;
	}

	public float getSilicato() {
		return silicato;
	}

	public void setSilicato(float silicato) {
		this.silicato = silicato;
	}

	public LocalDateTime getMedicao() {
		return medicao;
	}

	public void setMedicao(LocalDateTime medicao) {
		this.medicao = medicao;
	}

}