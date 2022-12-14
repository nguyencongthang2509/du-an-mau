package services;

import domainmodels.SanPham;
import java.util.List;
import java.util.UUID;
import viewmodels.SanPhamResponse;

public interface SanPhamService {
    
    List<SanPhamResponse> getAllResponse();

    String insert(SanPham sanPham);

    String delete(UUID id);

    String update(SanPham sanPham);
    
    List<SanPham> getAll();
}
