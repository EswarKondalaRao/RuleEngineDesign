package bkr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kboddeda on 7/6/2018.
 */
public class RuleEngine {

    List<RuleI<Phone, Phone>> rules;

    public RuleEngine(){
        rules = new ArrayList<>();
    }

    public Phone rule(Phone phone){
        return rules.stream()
                .filter(rule -> rule.matches(phone))
                .map(rule -> rule.process(phone))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Rule match found"));
    }

    public RuleEngine register(RuleI<Phone, Phone> rule){
        rules.add(rule);
        return this;
    }
}
