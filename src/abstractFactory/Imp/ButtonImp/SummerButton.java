package abstractFactory.Imp.ButtonImp;

import abstractFactory.Button;

public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("浅蓝色按钮");
    }
}
