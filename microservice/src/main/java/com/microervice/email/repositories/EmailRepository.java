package com.microervice.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microervice.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
	
//	Estendemos a classe JpaRepository para utilizar métodos prontos como findById, findAll, Save, Delete etc..

}
