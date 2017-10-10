public class cyclS {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i == ((i * i) % 1000)) {
                System.out.println(i + " = " + i*i);
            }
        }
    }
}
