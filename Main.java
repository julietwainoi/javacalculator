interface Animal {
    public void makesound();

    public void sleep();
}

class Pig implements Animal {

    public void makesound() {
        System.out.println("whoooo");
    };

    public void sleep() {
        System.out.println("zzz");
    };
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.makesound();
        myPig.sleep();
    }

}