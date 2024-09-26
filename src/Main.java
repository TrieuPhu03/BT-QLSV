import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem thu nhat: ");
        float diem1 = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap diem thu hai: ");
        float diem2 = Float.parseFloat(sc.nextLine());

        System.out.print("Nhap diem thu ba: ");
        float diem3 = Float.parseFloat(sc.nextLine());

        System.out.println("Nhap khu vuc cua thi sinh");
        System.out.println("A. Khu vuc A");
        System.out.println("B. Khu vuc B");
        System.out.println("C. Khu vuc C");
        System.out.println("X. Khong cu khu vuc");
        String khuvuc = sc.nextLine();
        float diemKhuVuc = 0;
        switch (khuvuc){
            case "A":
                diemKhuVuc = 2.0f;
                break;
            case "B":
                diemKhuVuc = 1.0f;
                break;
            case "C":
                diemKhuVuc = 0.5f;
                break;
            default:
                diemKhuVuc = 0;
                break;
        }
        System.out.println("Nhap doi tuong cua thi sinh");
        System.out.println("1. Khu vuc 1");
        System.out.println("2. Khu vuc 2");
        System.out.println("3. Khu vuc 3");
        System.out.println("0. Khong co doi tuong");
        String uuTien = sc.nextLine();
        float diemUuTien = 0;
        switch (uuTien){
            case "1":
                diemUuTien = 2.5f;
                break;
            case "2":
                diemUuTien = 1.5f;
                break;
            case "3":
                diemUuTien = 1f;
                break;
            default:
                diemUuTien = 0;
                break;
        }

        System.out.print("Moi ban nhap diem chuan: ");
        float diemChuan = Float.parseFloat(sc.nextLine());

        float sum = diem1 + diem2 + diem3 + diemUuTien + diemKhuVuc;
        if(sum >= diemChuan){
            System.out.println("Ban da dau voi so diem: " + sum);
        }else{
            System.out.println("Ban da rot voi so diem: " + sum);
        }

    }
}