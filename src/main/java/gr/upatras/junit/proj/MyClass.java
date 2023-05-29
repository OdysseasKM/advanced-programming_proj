package gr.upatras.junit.proj;

public class MyClass {
	public String subtract(int a, int b) {
        int result = a - b;
        
        if (result > 0) {
            return "POSITIVE";
        } else if (result < 0) {
            return "NEGATIVE";
        } else {
            return "ZERO";
        }
    }
}
