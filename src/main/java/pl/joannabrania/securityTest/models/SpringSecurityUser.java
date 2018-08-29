package pl.joannabrania.securityTest.models;


import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Data
public class SpringSecurityUser implements UserDetailsService {

        @Override
        public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
            return null;
        }

}

