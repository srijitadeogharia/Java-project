public class ColorfulStringExample {
    public static final String RESET = "\033[0m";  
    public static final String RED = "\033[0;31m"; 
    public static final String GREEN = "\033[0;32m"; 
    public static final String YELLOW = "\033[0;33m"; 
    public static final String BLUE = "\033[0;34m"; 
    public static final String PURPLE = "\033[0;35m"; 
    public static final String CYAN = "\033[0;36m";

    public static void main(String[] args) {
        
        System.out.println(RED + "This is red text!");
        System.out.println(GREEN + "This is green text!" );
        System.out.println(YELLOW + "This is yellow text!" );
        System.out.println(BLUE + "This is blue text!" );
        System.out.println(PURPLE + "This is purple text!" );
        System.out.println(CYAN + "This is cyan text!" +RESET);
    }
}