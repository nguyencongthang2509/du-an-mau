package viewmodels;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CuaHangResponse {

    private UUID id;
    private String ma;
    private String ten;
    private String diaChi;
    private String thanhPho;
    private String quocGia;

    public Object[] toDataRow(int index) {
        return new Object[]{index, ma, ten, diaChi, thanhPho, quocGia};
    }
}
