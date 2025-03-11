package iuh.demo.bai3.main;

import iuh.demo.bai3.entity.JapaneseAdaptee;
import iuh.demo.bai3.entity.TranslatorAdapter;
import iuh.demo.bai3.entity.VietnameseTarget;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
