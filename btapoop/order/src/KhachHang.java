import java.util.ArrayList;
import java.util.List;

class KhachHang {
    // Khai báo các thuộc tính của khách hàng
    private String diaChi;
    private int khachHangID;
    private String tenKH;
    private List<HoaDon> hoaDons;

    public KhachHang(String diaChi, int khachHangID, String tenKH) {
        this.diaChi = diaChi;
        this.khachHangID = khachHangID;
        this.tenKH = tenKH;
        this.hoaDons = new ArrayList<>();
    }

    // Phương thức để thêm hóa đơn vào danh sách của khách hàng
    public void themHoaDon(HoaDon hoaDon) {
        hoaDons.add(hoaDon);
    }

    // Phương thức để lấy tên khách hàng
    public String getTenKH() {
        return tenKH;
    }
    public String getDiaChi() {
        return diaChi;
    }
}