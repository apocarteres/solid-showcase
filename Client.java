package validator;

public class Client {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.post(new Model("Bob", "street"));
    }
}
