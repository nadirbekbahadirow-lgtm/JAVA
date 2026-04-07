public class Main {
    public static void main(String[] args) {
        String text = "Salem123 alem456";

        String result = text.replaceAll("\\d+", "");

        System.out.println(result);
    }
}