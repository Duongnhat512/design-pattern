package iuh.demo.bai1.entity;

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Subject{
    private String tenLop;
    private List<Observer> lists;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.lists = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        this.lists.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.lists.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : lists) {
            observer.update("Thong bao tu " + this.tenLop);
        }
    }
}
