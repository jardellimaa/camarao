package br.com.camarao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.camarao.model.Login;

public interface Logins extends JpaRepository<Login, Integer> {
	
	public Optional<Login> findByLogin(String login);
	public Login deleteByLogin(String login);

}
