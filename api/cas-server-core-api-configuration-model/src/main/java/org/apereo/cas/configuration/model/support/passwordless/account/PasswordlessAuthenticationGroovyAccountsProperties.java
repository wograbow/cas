package org.apereo.cas.configuration.model.support.passwordless.account;

import org.apereo.cas.configuration.model.SpringResourceProperties;
import org.apereo.cas.configuration.support.RequiresModule;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serial;

/**
 * This is {@link PasswordlessAuthenticationGroovyAccountsProperties}.
 *
 * @author Misagh Moayyed
 * @since 6.2.0
 */
@RequiresModule(name = "cas-server-support-passwordless-webflow")
@Getter
@Setter
@Accessors(chain = true)
public class PasswordlessAuthenticationGroovyAccountsProperties extends SpringResourceProperties {
    @Serial
    private static final long serialVersionUID = 8079027843747126083L;
}
