public class ControlFlowDemo {
    public static void main(String[] args) {
        int score = 85;

        // 1. IF-ELSE (Decision Making)
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // 2. SWITCH (Decision Making)
        char dayCode = 'M';
        switch (dayCode) {
            case 'M':
                System.out.println("Day: Monday");
                break;
            case 'F':
                System.out.println("Day: Friday");
                break;
            default:
                System.out.println("Day: Weekend");
        }

        // 3. FOR LOOP (Repeating a known number of times)
        System.out.print("For loop count: ");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. WHILE LOOP with BREAK & CONTINUE
        int count = 1;
        System.out.print("While loop with skip/stop: ");
        while (count <= 5) {
            if (count == 2) {
                count++;
                continue; // Skip printing 2
            }
            if (count == 4) {
                break; // Stop loop when count reaches 4
            }
            System.out.print(count + " ");
            count++;
        }
    }
}