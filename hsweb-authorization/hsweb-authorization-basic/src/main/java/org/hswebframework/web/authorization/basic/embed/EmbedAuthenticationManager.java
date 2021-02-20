package org.hswebframework.web.authorization.basic.embed;

import org.hswebframework.web.authorization.Authentication;
import org.hswebframework.web.authorization.AuthenticationManager;
import org.hswebframework.web.authorization.AuthenticationRequest;
import org.hswebframework.web.authorization.ReactiveAuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @author zhouhao
 * @since 3.0.0-RC
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
public class EmbedAuthenticationManager implements AuthenticationManager {

    @Autowired
    private EmbedAuthenticationProperties properties;

    @Override
    public Authentication authenticate(AuthenticationRequest request) {
        return properties.authenticate(request);

    }

    @Override
    public Optional<Authentication> getByUserId(String userId) {
        return properties.getAuthentication(userId);
    }


}
