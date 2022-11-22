package br.com.M8Music.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.M8Music.models.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
	
}
