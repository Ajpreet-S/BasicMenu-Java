import java.util.Scanner;

public class Menu 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (MainMenu()){}
    }

    // Print the menus
    public static boolean MainMenu()
    {
        System.out.println("\n1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Quit");
        switch(scanner.next().charAt(0)) {
            case '1':
                while (Option1()){};
                break;
            case '2':
                while (Option2()){};
                break;
            case '3':
                while (Option3()){};
                break;
            case '4':
                return false;
            default:
                System.out.println("Invalid input.");
        }
        return true;
    }

    public static boolean Option1()
    {
        System.out.println("\n1. Phrase 1");
        System.out.println("2. Phrase 2");
        System.out.println("3. Phrase 3");
        System.out.println("4. <----");
        switch(scanner.next().charAt(0)) {
            case '1':
                System.out.println("Break a leg!");
                break;
            case '2':
                System.out.println("Good morning.");
                break;
            case '3':
                System.out.println("Better late than never.");
                break;
            case '4':
                return false;
            default:
                System.out.println("Invalid input");
        }
        return true;
    }

    public static boolean Option2()
    {
        System.out.println("\n1. Learn about coffee.");
        System.out.println("2. Learn about math.");
        System.out.println("3. Learn about sleep.");
        System.out.println("4. <----");
        switch(scanner.next().charAt(0)) {
            case '1':
                System.out.println("Coffee is acidic.");
                break;
            case '2':
                System.out.println("1 + 1 is 2.");
                break;
            case '3':
                System.out.println("Sleep is important.");
                break;
            case '4':
                return false;
            default:
                System.out.println("Invalid input");
        }
        return true;
    }

    
    public static boolean Option3()
    {
        System.out.println("\n1. Action 1");
        System.out.println("2. Action 2");
        System.out.println("3. Action 3");
        System.out.println("4. <----");
        switch (scanner.next().charAt(0)) {
            case '1':
                System.out.println("Action 1 complete.");
                break;
            case '2':
                System.out.println("Action 2 complete.");
                break;
            case '3':
                System.out.println("Action 3 complete.");
                break;
            case '4':
                return false;
            default:
                System.out.println("Invalid input");
        }
        return true;
    }
}

