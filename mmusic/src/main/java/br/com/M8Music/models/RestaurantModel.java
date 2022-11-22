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
@Table(name = "TB_RESTAURANT")
public class RestaurantModel {
	    @Id
	    @Column(name = "NR_CNPJ")
	    private Double cnpj;

	    @Column(name = "DS_ADDRESS")
	    private String address;

	    @Column(name = "ID_USER")
	    private UserModel idUser;

}
