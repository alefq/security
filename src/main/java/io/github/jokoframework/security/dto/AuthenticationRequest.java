package io.github.jokoframework.security.dto;

import java.util.Map;

/**
 * Recibe las propiedades de la consulta login.
 * Se pueden agregar varias propiedades extras dentro de custom
 * @author danicricco
 *
 */
public class AuthenticationRequest {

	private String username;
	private String password;

	private Map<String, Object> custom;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getCustom() {
		return custom;
	}

	public void setCustom(Map<String, Object> custom) {
		this.custom = custom;
	}

}
