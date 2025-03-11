package iuh.demo.bai2.entity;

import java.util.ArrayList;
import java.util.List;

public class BanComposite implements Composite{
    private String name;
    private double price;
    private List<DoUongLeaf> list;

    public BanComposite(String name) {
        this.name = name;
        this.list = new ArrayList<DoUongLeaf>();
        this.price = 0;
    }

    public void add(DoUongLeaf doUong) {
        list.add(doUong);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0;
        for (Composite composite : list) {
            totalPrice += composite.totalPrice();
        }
        this.price = totalPrice;
        return totalPrice;
    }
}
