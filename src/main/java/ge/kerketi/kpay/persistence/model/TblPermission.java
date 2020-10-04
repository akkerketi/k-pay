package ge.kerketi.kpay.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tbl_permission")
public class TblPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


}
