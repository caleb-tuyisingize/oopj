
public class LoopingFourWeeksOfMonth {
    public static void main(String[] args) {
        int counter = 0;
        for(int year = 1; year <= 12; year++){
        for (int week = 1; week <= 4; week++) {
            System.out.print("Week " + week + ": ");
            for (int day = 1; day <= 7; day++) {
                counter += 1;
                System.out.printf("%3d| ", counter);
            }
            System.out.println(""); // Blank line between weeks
        }
        System.out.println("====== ======= ====== ====== ====== ======");
        System.out.println();
        }
    }
}