// abstract class
abstract class Main {
    public String name = "jane";
    public int age = 4;

    public abstract void study();

}

class Student extends Main {
    private int id = 3;

    public void study() {
        System.out.println("Studying all the long");

    }

    public static void main(String[] args) {

        Student myobject = new Student();
        System.out.println("mi id is: " + myobject.id);
        System.out.println("my name is:" + myobject.name);
        System.out.println("my age is:" + myobject.age);
        myobject.study();

    }

}
