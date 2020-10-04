package ge.kerketi.kpay.persistence.model;

import ge.kerketi.kpay.persistence.model.enums.Channel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_client_lock_time")
public class TblAccountLockTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "lock_time")
    private int lockTime;

    @Column(name = "channel")
    private Channel channel;

}
