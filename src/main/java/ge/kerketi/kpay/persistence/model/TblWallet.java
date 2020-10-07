package ge.kerketi.kpay.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_wallet")
public class TblWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "active")
    private boolean active;

    @Column(name = "time_created")
    @NotNull
    private Date timeCreated;

    @Column(name = "time_modified")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date timeModified;

    @Column(name = "visible")
    private boolean visible;

    @Column(name = "balance_available")
    private long balanceAvailable;

    @Column(name = "balance_blocked")
    private long balanceBlocked;

    @Column(name = "balancePending")
    private long balancePending;

    @Column(name = "limit_lower")
    private long limitLower;

    @Column(name = "limit_upper")
    private long limitUpper;

    @Column(name = "limit_notification")
    private long limitNotification;

    @ManyToOne
    private TblWalletType walletType;
}
