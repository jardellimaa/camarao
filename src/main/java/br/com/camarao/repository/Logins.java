package br.com.camarao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.camarao.model.Login;

public interface Logins extends JpaRepository<Login, Long> {

}
