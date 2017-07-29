package validator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorFacade implements Validator {
    private final List<Validator> validators;

    public ValidatorFacade() {
        validators = new ArrayList<Validator>() {{
            add(new AddressValidator());
            add(new NameValidator());
            add(new OnlyHalfModelValidator());
        }};
    }

    @Override
    public boolean isValid(Model model) {
        return validators.stream().filter(v->v.isValid(model)).count() == validators.size();
    }
}
