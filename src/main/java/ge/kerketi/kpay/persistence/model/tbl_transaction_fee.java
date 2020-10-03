package ge.kerketi.kpay.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_tranaction_fee")
public class tbl_transaction_fee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "fix_value")
    private Long fixValue;

    @Column(name = "percentage")
    private Double percentage;

    @Column(name = "deduct_from_total_amount")
    private boolean deductFromTotalAmount;

    @Column(name = "amount_greater_or_equals")
    private Long amountGreaterOrEquals;

    @Column(name = "amount_greater_or_less")
    private Long amountGreaterOrLess;

    @OneToOne
    private TblTransactionType generatedTransactionType;
}
