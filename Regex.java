
public class Regex{
    public static void main(String[] args) {
        // String text = "The rain in SPAIN stays mainly in the plain";
        // String pattern = "ain";
        // System.out.println(text.matches("."));

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

        String domain = "programmer@gmail.com";
        int atSymbolIndex = domain.indexOf("@");
        int comSymbolIndex = domain.indexOf(".");
        String domain_name = domain.substring(0,atSymbolIndex);
        System.out.println(domain_name);

        String date = "20/12/2025";
        // For not exceeding a specified year
        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(202[3-4]|2030)$";
        boolean matches = date.matches(pattern);
        System.out.println("Pattern found: " + matches);

        String binaryCheck = "21010101";
        String binaryPattern = "[0-1]+$";
        if(binaryCheck.matches(binaryPattern)){
            System.out.println(binaryCheck + " is a valid binary number.");
        } else {
            System.out.println(binaryCheck + " is not a valid binary number.");
        }
        // System.out.print(date);
    }   
}