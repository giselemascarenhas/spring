package com.microervice.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.microervice.email.enums.StatusEmail;
import lombok.Data;


@Data 
// Importação do Lombok para não colocar os métodos Get/Set e construtores 
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
	
	private static final long serialVersinUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID emailId;
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;
	
	@Column(columnDefinition = "TEXT")
    // Quando colocamos a anotação TEXT, podemos inserir mais do que 250 caracteres.
	private String text;
	private LocalDateTime sendDateEmail;
	private StatusEmail statusEmail;
	
}
