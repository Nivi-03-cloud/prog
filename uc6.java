/* @author Nivriti Goel
  * @version 6
 */
public class HelloWorld {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String message = "Hello, ";

            // Build string with delimiter
            for (String name : args) {
                message += name + ", ";
            }

            // Remove trailing ", " using substring
            message = message.substring(0, message.length() - 2);

            message += "!";
            System.out.println(message);
        }
    }
}
