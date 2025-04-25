package main;

//Giao diện IThanhToan
interface IThanhToan {
 void thanhToan(double soTien);
}

//Lớp Thanh toán tiền mặt
class ThanhToanTienMat implements IThanhToan {
 @Override
 public void thanhToan(double soTien) {
     System.out.println("Thanh toán " + soTien + " VNĐ bằng tiền mặt.");
 }
}

//Lớp Thanh toán thẻ tín dụng
class ThanhToanTheTinDung implements IThanhToan {
 @Override
 public void thanhToan(double soTien) {
     System.out.println("Thanh toán " + soTien + " VNĐ bằng thẻ tín dụng.");
 }
}

//Lớp mô phỏng sử dụng hệ thống thanh toán
public class Main {
 public static void main(String[] args) {
     double soTien1 = 500000;
     double soTien2 = 1200000;

     IThanhToan thanhToanTienMat = new ThanhToanTienMat();
     IThanhToan thanhToanTheTinDung = new ThanhToanTheTinDung();

     thanhToanTienMat.thanhToan(soTien1);
     thanhToanTheTinDung.thanhToan(soTien2);
 }
}

