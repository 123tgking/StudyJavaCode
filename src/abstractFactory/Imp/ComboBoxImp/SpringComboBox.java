package abstractFactory.Imp.ComboBoxImp;

import abstractFactory.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("绿色组合框");
    }
}
