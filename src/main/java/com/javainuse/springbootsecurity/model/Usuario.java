package com.javainuse.springbootsecurity.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "users")
public class Usuario {//implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	@Column
	private String role;

	@JsonProperty("razaoSocial")
	private String razaoSocial;

	@JsonProperty("apelido")
	private String apelido;

	@JsonProperty("tipoUsuario")
	private String tipoUsuario;

	@JsonProperty("status")
	private String status;

	@JsonProperty("email")
	private String username;

	@JsonProperty("email")
	private String email;

	@JsonProperty("password")
	private String password;


}
