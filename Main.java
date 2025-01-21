
class Main {
    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("can vote");

        } else {
            System.out.println("can not vote");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}