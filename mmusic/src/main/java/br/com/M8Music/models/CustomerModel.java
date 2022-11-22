package br.com.M8Music.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TB_CUSTOMER")
public class CustomerModel {
	
	 @Id
	    @Column(name = "ID_CUSTOMER")
	    private Long id;

	    @Column(name = "DS_TOKEN")
	    private EventModel token;

	    @Column(name = "ID_USER")
	    private UserModel idUser;

}
