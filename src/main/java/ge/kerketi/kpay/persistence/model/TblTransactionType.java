package ge.kerketi.kpay.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_tranaction_type")
public class TblTransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "enable_otp")
    private boolean enable_otp;

    @Column(name = "fix_amount")
    private Long fixAmount;

    @Column(name = "max_amount_per_day")
    private Long maxAmountPerDay;

    @Column(name = "max_amount_per_week")
    private Long maxAmountPerWeek;

    @Column(name = "max_amount_per_month")
    private Long maxAmountPerMonth;

    @Column(name = "min_amount_per_transfer")
    private Long minAmountPerTransfer;

    @Column(name = "max_amount_per_transfer")
    private Long maxAmountPerTransfer;

    @Column(name = "max_amount_per_transfer_without_requiring_confirmation")
    private Long maxAmountPerTransferWithoutRequiringConfirmation;

    @Column(name = "maximum_transfer_per_day")
    private Integer maximumTransferPerDay;

    @Column(name = "maximum_transfer_per_week")
    private Integer maximumTransferPerWeek;

    @Column(name = "maximum_transfer_per_month")
    private Integer maximumTransferPerMonth;

    @Column(name = "minimum_period_between_transfer_in_seconds")
    private Long minimumPeriodBetweenTransferInSeconds;

    @Column(name = "requires_authorization")
    private boolean requiresAuthorization;

    @OneToMany
    private List<TblCustomField> customFields;

    @OneToOne
    private TblAccount fromAccount;

    @OneToOne
    private TblAccount toAccount;
}
