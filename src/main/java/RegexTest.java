public class RegexTest {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        String str = "ryan@#$%sko - upski";
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);
    }
}
