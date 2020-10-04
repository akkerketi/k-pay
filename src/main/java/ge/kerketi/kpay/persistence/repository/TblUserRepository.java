package ge.kerketi.kpay.persistence.repository;


import ge.kerketi.kpay.persistence.model.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TblUserRepository extends JpaRepository<TblUser, Long> {

    Optional<TblUser> findByUsername(String username);

    Boolean existsByUsername(String username);

}
