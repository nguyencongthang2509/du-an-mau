package domainmodels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "HoaDonChiTiet")
@IdClass(HoaDonChiTietId.class)
public class HoaDonChiTiet implements Serializable {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdHoaDon", nullable = false)
    private HoaDon IdHoaDon;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdChiTietSP", nullable = false)
    private ChiTietSP IdChiTietSP;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia")
    private BigDecimal donGia;
}
