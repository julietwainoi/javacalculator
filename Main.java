// HelloWorld.java
public class Main {
    public void MainMethod() {
        System.out.println("Hello, staticMainMethod!");
    }

    static void staticMainMethod() {
        System.out.println("Hello, staticMainMethod!");
    }

    public static void main(String[] args) {
        staticMainMethod();

        Main myobject = new Main();
        myobject.MainMethod();
    }

}