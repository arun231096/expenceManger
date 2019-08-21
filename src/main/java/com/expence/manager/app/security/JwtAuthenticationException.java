package com.expence.manager.app.security;

import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JwtAuthenticationException(String msg) {
        super(msg);
    }
}
