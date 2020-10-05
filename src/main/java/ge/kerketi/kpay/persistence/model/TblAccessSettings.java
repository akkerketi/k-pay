package ge.kerketi.kpay.persistence.model;

import ge.kerketi.kpay.persistence.model.enums.PasswordExpiresAfter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tbl_AccessSettings")
public class TblAccessSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "password_length_min")
    private int passwordLengthMin;

    @Column(name = "password_length_max")
    private int passwordLengthMax;

    @Column(name = "password_policy")
    private String passwordPolicy;

    @Column(name = "token_expiration_msec")
    private long tokenExpirationMSec;

    @Column(name = "password_expires_after")
    private PasswordExpiresAfter passwordExpiresAfter;

    @OneToMany
    private Collection<TblAccountLockTime> accountLockTimes;

}
