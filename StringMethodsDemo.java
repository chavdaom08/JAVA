public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello World";

        // 1. length() 
        int len = str.length();
        System.out.println("Length: " + len); 

        // 2. StringBuilder reverse() 
        
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed); // dlroW olleH

        // 3. replace() 
        String replaced = str.replace('o', '0');
        System.out.println("Replaced: " + replaced); // Hell0 W0rld

        // 4. charAt() 
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch); // 'e'
    }
}