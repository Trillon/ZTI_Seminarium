package proj4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CustomUserService customUserService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String username = authentication.getName();
        final String password = (String) authentication.getCredentials();

        UserDetails user = customUserService.loadUserByUsername(username);

        if (user == null || !user.getUsername().equalsIgnoreCase(username))
            throw new BadCredentialsException("Nie znaleziono użytkownika");

        if (!password.equals(user.getPassword()))
            throw new BadCredentialsException("Złe hasło dla użytkownika: " + username);

        return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
