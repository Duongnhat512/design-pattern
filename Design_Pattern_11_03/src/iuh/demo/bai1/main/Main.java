package iuh.demo.bai1.main;

import iuh.demo.bai1.entity.LopHoc;
import iuh.demo.bai1.entity.SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Ngo Quoc Dat");
        SinhVien sv2 = new SinhVien("Vo Van Nghia Hiep");

        LopHoc lopHoc = new LopHoc("DHKTPM17C");
        lopHoc.attach(sv1);
        lopHoc.attach(sv2);

        lopHoc.notifyObservers();

        lopHoc.detach(sv1);
        lopHoc.notifyObservers();

    }
}
