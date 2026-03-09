public class PasswordValidator {

    public static boolean isValid(String password) {

        if (password.length() < 8) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }

        return hasUpper && hasLower;
    }
}
