package domainmodels;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "MatKhau")
    private String matKhau;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCH")
    private CuaHang cuaHang;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCV")
    private ChucVu chucVu;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdGuiBC")
    private NhanVien nhanVien;
    
    @Column(name = "TrangThai")
    private Integer trangThai;
}
