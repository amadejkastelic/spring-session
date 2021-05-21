package org.springframework.session;

import org.springframework.lang.Nullable;

/**
 * @author Amadej Kastelic
 */
public interface CreateWithIdSessionRepository<S extends Session> extends SessionRepository<S> {

	S createSession(@Nullable String id);
}
