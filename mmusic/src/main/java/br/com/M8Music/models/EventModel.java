package br.com.M8Music.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "TB_EVENT")

public class EventModel {
	
	@Id
    @Column(name = "DS_TOKEN")
    private String token;

    @Column(name = "DT_EVENT")
    private Date date;

    @Column(name = "NR_RATTING")
    private Double ratting;

    @Column(name = "ID_MUSICIAN")
    private MusicianModel idMus;

    @Column(name = "NR_CNPJ")
    private RestaurantModel cnpjRestaurant;

}
