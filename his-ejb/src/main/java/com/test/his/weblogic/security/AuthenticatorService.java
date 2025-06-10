package com.test.his.weblogic.security;

import javax.ejb.Local;

@Local
public interface AuthenticatorService {
	String NAME = "authenticator";
	String JNDI_NAME = "java:app/his-ejb/AuthenticatorServiceBean";

	boolean authenticate();
}
