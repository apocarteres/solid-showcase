package validator;

public class OnlyHalfModelValidator implements Validator {
    @Override
    public boolean isValid(Model model) {
        return false;
    }
}
