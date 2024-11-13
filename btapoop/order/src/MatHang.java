class MatHang {
    // Khai báo các thuộc tính của mặt hàng
    private float gia;
    private int matHangID;
    private int soLuong;
    private String tenMH;

    // Tạo constructor
    public MatHang(float gia, int matHangID, int soLuong, String tenMH) {
        this.gia = gia;
        this.matHangID = matHangID;
        this.soLuong = soLuong;
        this.tenMH = tenMH;
    }

    // Phương thức để lấy giá của mặt hàng
    public float getGia() {
        return gia;
    }

    // Phương thức để lấy tên mặt hàng
    public String getTenMH() {
        return tenMH;
    }

    // Phương thức để thêm số lượng mặt hàng vào kho
    public void themMatHangVaoKho(int soLuong) {
        this.soLuong += soLuong;
    }
}
