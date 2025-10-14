
public class Regex{
    public static void main(String[] args) {
        String text = "The rain in SPAIN stays mainly in the plain";
        String pattern = "ain";
        System.out.println(text.matches("."));

        // // Check if the pattern exists in the text
        // boolean matches = text.matches(".*" + pattern + ".*");
        // System.out.println("Pattern found: " + matches);

        // // Replace all occurrences of the pattern with "XYZ"
        // String replacedText = text.replaceAll(pattern, "XYZ");
        // System.out.println("Replaced Text: " + replacedText);

        // // Split the text based on spaces
        // String[] splitText = text.split(" ");
        // System.out.println("Split Text:");
        // for (String word : splitText) {
        //     System.out.println(word);
        // }
    }   
}