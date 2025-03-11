package iuh.demo.bai2.entity;

import java.util.ArrayList;
import java.util.List;

public class BanComposite implements Composite{
    private String name;
    private double totalPrice;
    private List<Composite> list;

    public BanComposite(String name) {
        this.name = name;
        this.list = new ArrayList<Composite>();
        this.totalPrice = 0;
    }

    public void add(Composite doUong) {
        list.add(doUong);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for (Composite composite : list) {
            totalPrice += composite.totalPrice();
        }
        this.totalPrice = totalPrice;
        return totalPrice;
    }
}
