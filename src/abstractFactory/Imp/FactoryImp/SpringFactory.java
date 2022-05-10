package abstractFactory.Imp.FactoryImp;

import abstractFactory.Button;
import abstractFactory.ComboBox;
import abstractFactory.Imp.ButtonImp.SpringButton;
import abstractFactory.Imp.ComboBoxImp.SpringComboBox;
import abstractFactory.Imp.TextFieldImp.SpringTextField;
import abstractFactory.SkinFactory;
import abstractFactory.TextField;

public class SpringFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
