public public class StringComparison {
    public static void main(String[] args) {
        // 1. StringBuffer (Thread-safe / Synchronized)
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println("StringBuffer: " + buffer);

        // 2. StringBuilder (Not thread-safe / Non-synchronized / Faster)
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println("StringBuilder: " + builder);
    }
} {
    
}
