public class Main {
    public static void main(String[] args) {
        // Exemple de saisie de l'utilisateur
        String input = "Hello world"; // Assurez-vous que l'entrée est correcte et valide
        String base = "hexadecimal"; // ou "-h" pour la forme abrégée
        
        // Validation de la chaîne de caractères
        if (Validator.isValidInput(input)) {
            // Conversion de la chaîne de caractères
            String converted = Converter.convertToBase(input, base);
            System.out.println("Converted: " + converted);
            
            // Chiffrement de la chaîne de caractères
            int key = 3; // clé de chiffrement pour l'algorithme de César
            String encrypted = Cipher.caesarEncrypt(converted, key);
            System.out.println("Encrypted: " + encrypted);
            
            // Déchiffrement de la chaîne de caractères
            String decrypted = Cipher.caesarDecrypt(encrypted, key);
            System.out.println("Decrypted: " + decrypted);
        } else {
            System.out.println("Invalid input. Please enter a valid string.");
        }
    }
}


