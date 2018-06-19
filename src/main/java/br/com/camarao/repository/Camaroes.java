package br.com.camarao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.camarao.model.Camarao;

public interface Camaroes extends JpaRepository<Camarao, Integer> {
	
	@Query(value = "SELECT * FROM CAMARAO c order by c.id desc limit 1", nativeQuery = true)
	public Camarao findLastRecord();
	
	public List<Camarao> findAllByOrderByIdDesc();
	
	
}
