package abstractFactory.Imp.FactoryImp;

import abstractFactory.Button;
import abstractFactory.ComboBox;
import abstractFactory.Imp.ButtonImp.SummerButton;
import abstractFactory.Imp.ComboBoxImp.SummerComboBox;
import abstractFactory.Imp.TextFieldImp.SummerTextField;
import abstractFactory.SkinFactory;
import abstractFactory.TextField;

public class SummerFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
