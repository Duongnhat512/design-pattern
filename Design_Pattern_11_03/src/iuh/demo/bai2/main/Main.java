package iuh.demo.bai2.main;

import iuh.demo.bai2.entity.BanComposite;
import iuh.demo.bai2.entity.DoUongLeaf;
import iuh.demo.bai2.entity.QuanCaPheComposite;

public class Main {
    public static void main(String[] args) {
        DoUongLeaf doUongLeaf = new DoUongLeaf("Cà phê sữa", 20000);
        DoUongLeaf doUongLeaf1 = new DoUongLeaf("Cà phê đen", 15000);
        DoUongLeaf doUongLeaf2 = new DoUongLeaf("Cà phê sữa đá", 25000);
        DoUongLeaf doUongLeaf3 = new DoUongLeaf("Cà phê đen đá", 20000);
        DoUongLeaf doUongLeaf4 = new DoUongLeaf("Cà phê sữa nóng", 20000);
        DoUongLeaf doUongLeaf5 = new DoUongLeaf("Cà phê đen nóng", 15000);
        DoUongLeaf doUongLeaf6 = new DoUongLeaf("Cà phê sữa đá", 25000);

        BanComposite banComposite = new BanComposite("Bàn 1");
        banComposite.add(doUongLeaf);
        banComposite.add(doUongLeaf1);
        banComposite.add(doUongLeaf2);
        System.out.println("Tong tien ban 1: " + banComposite.totalPrice());

        BanComposite banComposite1 = new BanComposite("Bàn 2");
        banComposite1.add(doUongLeaf3);
        banComposite1.add(doUongLeaf4);
        banComposite1.add(doUongLeaf5);
        banComposite1.add(doUongLeaf6);
        System.out.println("Tong tien ban 2: " + banComposite1.totalPrice());

        QuanCaPheComposite quanCaPheComposite = new QuanCaPheComposite("Quán cà phê");
        quanCaPheComposite.add(banComposite);
        quanCaPheComposite.add(banComposite1);
        System.out.println("Tong tien quan: " + quanCaPheComposite.totalPrice());
    }
}
