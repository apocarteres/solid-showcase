package validator;

public class Controller {

    private final Validator validator;

    public Controller() {
        validator = new ValidatorFacade();
    }

    public void post(Model model) {
        if (validator.isValid(model)) {
            save(model);
        }
    }

    private void save(Model model) {
        System.out.println("saved!");
    }
}
