package abstractFactory.Imp.TextFieldImp;

import abstractFactory.TextField;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("绿色文本框");
    }
}
