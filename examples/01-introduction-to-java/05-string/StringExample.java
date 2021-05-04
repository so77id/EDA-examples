import java.util.Scanner;  // Import the Scanner class

class StringExample
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String s1 = scanner.nextLine();  // Read user input
        // String s2 = scanner.nextLine();  // Read user input

        // System.out.println(s1 + s2);

        for(int i=0; i<s1.length(); i++){
            System.out.print(s1.charAt(i));
            System.out.print("\n");
        }
    }
}
