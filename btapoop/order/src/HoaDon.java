import java.util.*;

class HoaDon {

    private int hoaDonID;
    private KhachHang kh; // Khách hàng liên quan đến hóa đơn
    private String ngayBan;
    private float tongTien;
    private List<MatHangMua> listMua; // Danh sách các mặt hàng mua trong hóa đơn

    public HoaDon(int hoaDonID, KhachHang kh, String ngayBan) {
        this.hoaDonID = hoaDonID;
        this.kh = kh;
        this.ngayBan = ngayBan;
        this.tongTien = 0;
        this.listMua = new ArrayList<>();
    }

    // Phương thức để thêm mặt hàng mua vào hóa đơn
    public void themMatHangMua(MatHangMua matHangMua) {
        listMua.add(matHangMua);
        tongTien += matHangMua.getSl() * matHangMua.getMh().getGia();
    }

    // Phương thức để in thông tin hóa đơn
    public void inHoaDon() {
        System.out.println("------------------------------");
        System.out.println("Mã hóa đơn: " + hoaDonID);
        System.out.println("Khách hàng: " + kh.getTenKH());
        System.out.println("Địa chỉ: " + kh.getDiaChi());
        System.out.println("Ngày bán: " + ngayBan);
        System.out.println("Tổng tiền: " + tongTien);
        System.out.println("------------------------------");
        for (MatHangMua matHangMua : listMua) {
            System.out.println(" - " + matHangMua.getMh().getTenMH() + ": "
                    + matHangMua.getSl() + " x " + matHangMua.getMh().getGia());
        }
    }
}
