class MatHangMua {
    private HoaDon hd; // Hóa đơn liên quan đến mặt hàng mua
    private int matHangMuaID;
    private int sl;
    private MatHang mh; // Thông tin mặt hàng

    public MatHangMua(HoaDon hd, int matHangMuaID, int sl, MatHang mh) {
        this.hd = hd;
        this.matHangMuaID = matHangMuaID;
        this.sl = sl;
        this.mh = mh;
    }

    // Phương thức để lấy số lượng mua
    public int getSl() {
        return sl;
    }

    // Phương thức để lấy thông tin mặt hàng
    public MatHang getMh() {
        return mh;
    }
}
