package br.com.M8Music.models;

import br.com.M8Music.enums.TypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "TB_USER")
public class UserModel {

	@Id
    @Column(name = "ID_USER")
    private Long id;

    @Column(name = "NM_USER")
    private String name;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "PW_USER")
    private String password;

    @Column(name = "TP_USER")
    private TypeEnum type;
}
