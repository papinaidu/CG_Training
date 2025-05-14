public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$","255.34.200.89"));
    }
}