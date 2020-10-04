package ge.kerketi.kpay.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tbl_users")
public class TblUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "username")
    private String username;

    @NotNull
    @Size(min = 4, max = 100)
    @Column(name = "password")
    private String password;

    @Column(name = "last_password_changeDate")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastPasswordChangeDate;

    private boolean enabled;

    @Min(value = 0)
    @Max(value = 5)
    private Integer score;
}
