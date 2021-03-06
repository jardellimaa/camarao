package br.com.camarao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_LOGIN")
	@SequenceGenerator(name = "ID_LOGIN", sequenceName = "SEQ_ID_LOGIN", allocationSize = 1)
	private Integer id;

	private String login;

	private String senha;

	public Login() {
		super();
	}

	public Login(Integer id, String login, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
