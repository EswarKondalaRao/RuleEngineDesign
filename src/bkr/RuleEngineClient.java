package bkr;

/**
 * Created by kboddeda on 7/6/2018.
 */
public class RuleEngineClient {

    public static void main(String[] args) {

        RuleEngine ruleEngine = new RuleEngine();
        ruleEngine
                .register(new IPhone())
                .register(new Android());

        Phone androidPhone = new Phone(Phone.OSType.Android);

        Phone phone = ruleEngine.rule(androidPhone);
        System.out.println(androidPhone);
        System.out.println(phone);
    }
}
