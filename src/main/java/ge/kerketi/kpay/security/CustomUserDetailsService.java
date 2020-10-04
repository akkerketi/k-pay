package ge.kerketi.kpay.security;


import ge.kerketi.kpay.exception.ResourceNotFoundException;
import ge.kerketi.kpay.persistence.model.TblUser;
import ge.kerketi.kpay.persistence.repository.TblUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    final TblUserRepository tblUserRepository;

    public CustomUserDetailsService(TblUserRepository tblUserRepository) {
        this.tblUserRepository = tblUserRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        TblUser tblUser = tblUserRepository.findByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with username : " + username)
                );

        return UserPrincipal.create(tblUser);
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        TblUser tblUser = tblUserRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("User", "id", id)
        );

        return UserPrincipal.create(tblUser);
    }
}
