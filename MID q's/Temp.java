public class Temp {
    public static void main(String[] args) {
        int[] temps = {28, 32, 31, 29, 35, 30, 27};

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Day " + (i + 1) + " Temperature: " + temps[i] + "°C");
        }
    }
}