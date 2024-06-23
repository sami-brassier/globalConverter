public class Converter {
    public static String convertToBase(String input, String base) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            int ascii = (int) c;
            switch (base) {
                case "hexadecimal":
                case "-h":
                    result.append(Integer.toHexString(ascii)).append(" ");
                    break;
                case "octal":
                case "-o":
                    result.append(Integer.toOctalString(ascii)).append(" ");
                    break;
                case "binary":
                case "-b":
                    result.append(Integer.toBinaryString(ascii)).append(" ");
                    break;
                case "decimal":
                case "-d":
                    result.append(ascii).append(" ");
                    break;
                case "text":
                case "-t":
                    result.append(c).append(" ");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid base: " + base);
            }
        }
        return result.toString().trim();
    }
}
