package viewmodels;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SanPhamResponse {

    private UUID id;
    private String ma;
    private String ten;

    public Object[] toDataRow(int index) {
        return new Object[]{index, ma, ten};
    }
}
