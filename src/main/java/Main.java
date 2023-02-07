public class Main {
    public static void main(String[] args) {
        BonusService servise = new BonusService();
        int expected = 150;
        long actual = servise.calculate(5000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = servise.calculate(5000, false);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}
