package ge.kerketi.kpay.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_account")
public class TblAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "max_amount")
    private Long maxAmount;

    @Column(name = "min_amount")
    private Long minAmount;

    @Column(name = "enabled")
    private boolean enabled;

    @ManyToOne
    private TblGroup group;

    @OneToOne
    private TblWallet wallet;

    @ManyToOne
    private TblUser user;

}
