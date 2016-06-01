package proj4;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class CustomUserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomUserDetails customUserDetails = new CustomUserDetails();
        customUserDetails.setUsername("user");
        customUserDetails.setPassword("user");
        Role role = new Role("ROLE_USER");
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        customUserDetails.setGrantedAuthorities(roles);
        return customUserDetails;
    }
}
