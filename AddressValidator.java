package validator;

public class AddressValidator implements Validator {

    @Override
    public boolean isValid(Model model) {
        return model.getAddress() != null;
    }
}
