package viewmodels;

import java.math.BigDecimal;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTietResponse {

    private UUID idChiTietSP;
    private UUID idHoaDon;
    private String maSP;
    private String tenSP;
    private Integer soLuongSP;
    private BigDecimal giaBan;

    public Object[] toDataRow(int index) {
        return new Object[]{index, maSP, tenSP, soLuongSP, giaBan, new BigDecimal(soLuongSP).multiply(giaBan)};
    }
}
