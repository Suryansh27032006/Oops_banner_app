public class UC4 {

    public static void main(String[] args) {

        String[] banner = createBanner();
        printBanner(banner);
    }

    public static String[] createBanner() {

        return new String[] {

                String.join("   ", " ***** ", " ***** ", " ******", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "****** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "*     *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };
    }

    public static void printBanner(String[] banner) {

        for (String line : banner) {
            System.out.println(line);
        }
    }
}