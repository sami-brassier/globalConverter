public class Validator {
    public static boolean isValidInput(String input) {
        return input != null && input.matches("[a-zA-Z0-9 ]+");
    }
}
