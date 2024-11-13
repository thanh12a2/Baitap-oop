public class Main {
    public static void main(String[] args) {
        // Tạo các mặt hàng
        MatHang X = new MatHang(100.1f, 1, 10, "X");
        MatHang Y = new MatHang(200.1f, 2, 20, "Y");
        MatHang Z = new MatHang(300.1f, 3, 30, "Z");

        // Tạo khách hàng "Nguyễn Văn A"
        KhachHang nguyenVanA = new KhachHang("Thanh Xuân", 1, "Nguyễn Văn A");

        // Tạo một hóa đơn cho khách hàng "Nguyễn Văn A"
        HoaDon hoaDon = new HoaDon(1, nguyenVanA, "13/11/2024");

        // Tạo các mặt hàng mà khách hàng "Nguyễn Văn A" mua
        MatHangMua muaX = new MatHangMua(hoaDon, 1, 2, X);
        MatHangMua muaY = new MatHangMua(hoaDon, 2, 1, Y);

        // Thêm các mặt hàng mua vào hóa đơn
        hoaDon.themMatHangMua(muaX);
        hoaDon.themMatHangMua(muaY);

        // Thêm hóa đơn vào danh sách hóa đơn của khách hàng "Nguyễn Văn A"
        nguyenVanA.themHoaDon(hoaDon);

        // In thông tin hóa đơn
        hoaDon.inHoaDon();
    }
}