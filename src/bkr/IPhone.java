package bkr;

/**
 * Created by kboddeda on 7/6/2018.
 */
public class IPhone implements RuleI<Phone, Phone> {

    @Override
    public boolean matches(Phone input) {
        return Phone.OSType.IPhone.equals(input.getOsType());
    }

    @Override
    public Phone process(Phone input) {
        input.setModel("IPhone X");
        return  input;
    }
}
