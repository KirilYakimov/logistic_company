package nbu.project.logistic_company.prehandlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Haven't yet registered the class, but it can be used to handle authentication
 * and authorization scenarios:
 * 1. Creating user in db
 * 2. Creating session if user in db
 * 3. Authorizing user to access specific classes
 *
 * This exists to skip Spring Security as its architecture is too complex and for simplicity
 * and faster delivery of the project
 */
@Component
public class AuthorizationPreHandler extends HandlerInterceptorAdapter {

    @Autowired
    private HttpSession session;

    @Override
    public boolean preHandle(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler) throws Exception {
        return true;
    }
}
