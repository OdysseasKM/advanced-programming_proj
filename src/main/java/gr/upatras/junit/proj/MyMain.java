package gr.upatras.junit.proj;

public class MyMain {
	public static void main(String[] args) {
        MyClass m = new MyClass();
        
        String result = m.subtract(15, 10);
        System.out.println("Result: " + result);
    }
}
