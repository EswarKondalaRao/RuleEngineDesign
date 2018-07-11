package bkr;

/**
 * Created by kboddeda on 7/6/2018.
 */
public class Android implements RuleI<Phone, Phone> {

    @Override
    public boolean matches(Phone input) {
        return Phone.OSType.Android.equals(input.getOsType());
    }

    @Override
    public Phone process(Phone input) {
        input.setModel("One Plus 6");
        return input;
    }
}
