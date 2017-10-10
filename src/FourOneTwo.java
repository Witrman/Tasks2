public class FourOneTwo {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i == ((i %100) *7)) {
                System.out.println(i + " = " + i%100+" * "+7);
            }
        }
    }
}
