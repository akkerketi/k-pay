package ge.kerketi.kpay.persistence.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_wallet_type")
public class TblWalletType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "wallet_currency")
    private String walletCurrency;

    @Column(name = "wallet_currency_symbol")
    private String walletCurrencySymbol;

    @Column(name = "wallet_name")
    private String walletName;

    @Column(name = "wallet_show")
    private boolean walletShow;
}
