package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chucNang;
        do {
            System.out.println("1. Thông tin NYC");
            System.out.println("2. Check điểm sinh viên");
            System.out.println("3. Số lượng sinh viên các lớp");
            System.out.println("0. THOÁT CHƯƠNG TRÌNH");
            System.out.print("Mời bạn lựa chọn chức năng: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            switch (chucNang) {
                case 1: {
                    System.out.print("Mời nhập tên NYC: ");
                    String ten = scanner.nextLine();
                    System.out.print("Mời nhập tuổi NYC: ");
                    int tuoi = Integer.parseInt(scanner.nextLine());
                    System.out.print("Mời nhập địa chỉ NYC: ");
                    String diaChi = scanner.nextLine();
                    System.out.print("Mời nhập quê quán NYC: ");
                    String queQuan = scanner.nextLine();
                    System.out.println("Thông tin NYC: ");
                    System.out.println("Tên: " + ten);
                    System.out.println("Tuổi: " + tuoi);
                    System.out.println("Địa chỉ: " + diaChi);
                    System.out.println("Quê quán: " + queQuan);
                    break;
                }
                case 2: {
                    int diem = -1;
                    while (diem < 0 || diem > 10) {
                        System.out.print("Mời nhập điểm:");
                        diem = Integer.valueOf(scanner.nextLine());
                    }
                    if (diem < 5) {
                        System.out.println("Bạn fail rôiiiii");
                    } else {
                        System.out.println("Bạn đã qua môn");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Mời nhập số lượng lớp: ");
                    int soLuongLop = Integer.parseInt(scanner.nextLine());
                    int[] arrSoLuongSinhVien = new int[soLuongLop];
                    for (int i = 0; i < soLuongLop; i++) {
                        System.out.print("Mời nhập số sinh viên ở "
                                + "lớp thứ " + (i + 1) + ": ");
                        arrSoLuongSinhVien[i] = Integer.parseInt(scanner.nextLine());
                    }

                    System.out.println("Số lượng sinh viên các lớp:");
                    for (int i = 0; i < soLuongLop; i++) {
                        System.out.println("Số sinh viên lớp thứ "
                                + (i + 1) + ": " + arrSoLuongSinhVien[i]);
                    }
                    break;
                }
                case 0:
                    System.out.println("Hẹn gặp lại!");
                    break;
                default: {
                    System.out.println("Mời chọn lại chức năng từ 0~3!");
                    break;
                }
            }
        } while (chucNang != 0);
    }

}
