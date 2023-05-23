package main;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Nhập và xuất tên, năm sinh, ngành học, điểm môn Java của bạn.
        // 2. Nhập điểm Java trong khoảng từ 0-10. Đưa ra thông báo qua môn hay học lại?
        // 3. Nhập mảng số lượng SV các lớp. Và xuất mảng số lượng SV ra
        Scanner scanner = new Scanner(System.in);
        int chucNang = 0;
        do {
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Thong bao ket qua");
            System.out.println("3. Nhap xuat mang");
            System.out.println("0. Thoat");
            System.out.print("Moi nhap chuc nang: ");
//            chucNang = scanner.nextInt();
//            // C1: scanner.nextLine();
//            scanner.nextLine();
            // C2: Ep kieu => valueOf hoac parseInt
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1: {
                    // Nhap
                    System.out.print("Moi nhap ten:");
                    String ten = scanner.nextLine();
                    System.out.print("Moi nhap nam sinh: ");
                    int namSinh = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Moi nhap nganh hoc:");
                    String nganhHoc = scanner.nextLine();
                    System.out.print("Moi nhap diem Java:");
                    int diemMonJava = scanner.nextInt();
                    // In 
                    System.out.println("Ten: " + ten + " - Nam Sinh: " + namSinh
                            + " - Nganh hoc: " + nganhHoc
                            + " - Diem Java: " + diemMonJava);
                    break;
                }
                case 2: {
                    int diem = -1;
                    while (diem < 0 || diem > 10) {
                        System.out.print("Moi ban nhap diem: ");
//                        diem = scanner.nextInt();
                        diem = Integer.valueOf(scanner.nextLine());
                    }
                    if (diem < 5) {
                        System.out.println("Hoc lai");
                    } else {
                        System.out.println("Qua mon roi. Hihi");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Moi nhap vao so luong lop: ");
                    int soLuongLop = Integer.valueOf(scanner.nextLine());
                    int[] danhSachSoLuongSinhViens = new int[soLuongLop];
                    // Nhap 
                    System.out.println("Moi nhap danh sach:");
                    for (int i = 0; i < soLuongLop; i++) {
                        danhSachSoLuongSinhViens[i]
                                = Integer.valueOf(scanner.nextLine());
                    }
                    // In 
                    System.out.println("In danh sach");
                    for (int i = 0; i < soLuongLop; i++) {
                        System.out.println(danhSachSoLuongSinhViens[i]);
                    }
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }
        } while (chucNang != 0);

    }

}

