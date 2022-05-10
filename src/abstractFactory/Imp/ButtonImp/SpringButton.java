package abstractFactory.Imp.ButtonImp;

import abstractFactory.Button;

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("浅绿色按钮");
    }
}
