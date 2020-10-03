package ge.kerketi.kpay.persistence.repository;

import ge.kerketi.kpay.persistence.model.TblAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblAccountRepository extends JpaRepository<TblAccount, Long> {
}
