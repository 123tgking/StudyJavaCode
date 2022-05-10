package abstractFactory.Imp.TextFieldImp;

import abstractFactory.TextField;

public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("浅蓝色文本框");
    }
}
