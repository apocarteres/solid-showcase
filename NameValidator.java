package validator;

public class NameValidator implements Validator {

    @Override
    public boolean isValid(Model model) {
        return model.getName() != null;
    }
}
