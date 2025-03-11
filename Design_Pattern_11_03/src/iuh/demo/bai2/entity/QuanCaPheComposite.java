package iuh.demo.bai2.entity;

import java.util.ArrayList;
import java.util.List;

public class QuanCaPheComposite implements Composite{
    private String name;
    private double price;
    private List<Composite> list;

    public QuanCaPheComposite(String name) {
        this.name = name;
        this.price = 0;
        this.list = new ArrayList<Composite>();
    }

    public void add(Composite ban) {
        list.add(ban);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for (Composite composite : list) {
            totalPrice += composite.totalPrice();
        }
        this.price = totalPrice;
        return this.price;
    }
}
