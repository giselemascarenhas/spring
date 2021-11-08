package com.microervice.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microervice.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
	
//	Estendemos a classe JpaRepository para utilizar métodos prontos como findById, findAll, Save, Delete etc..

}
