package abstractFactory;

import abstractFactory.Utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;

        factory = (SkinFactory) XMLUtil.getBean();
        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();

    }
}
