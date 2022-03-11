package com.javainuse.springbootsecurity.model;

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
public class UserDTO {
	
	private String username;
	
	private String password;
	
	private String role;

	private String razaoSocial;

	private String apelido;

	private String tipoUsuario;

	private String status;

}
