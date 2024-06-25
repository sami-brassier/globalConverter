public class Cipher {
    public static String caesarEncrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + key) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String caesarDecrypt(String input, int key) {
        return caesarEncrypt(input, 26 - key);
    }
}
