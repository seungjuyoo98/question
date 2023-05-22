package pastaquiz;

import java.util.Scanner;

public class Pasta {
    private String guest = "오우주";
    int price = 8000;
    int noodle;
    int garlic;
    
    public Pasta(String guest) {
        this.guest = guest;
    }


    public void orderInfo() {
    	int price = 8000;
    	price += noodle + garlic;
        System.out.println("주문자: " + guest);
        System.out.println("기본 파스타 가격: " + price);
    }

    // 면 추가
    public void addNoodle() {
       noodle += 1000;
       System.out.println("면이 추가 되었습니다.(+"+noodle+"원)");
    }

    // 마늘 추가
    public void addGarlic() {
    	garlic += 2000;
    	System.out.println("마늘이 추가 되었습니다.(+"+garlic+"원)");
    }
}
