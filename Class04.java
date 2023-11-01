interface MyMath {
    public void show();
    public void add(int a, int b); // 計算 a+b
    public void sub(int a, int b); // 計算 a-b
    public void mul(int a, int b); // 計算 a*b
    public void div(int a, int b); // 計算 a/b
}

class Compute implements MyMath {
    private int ans;
    public void add(int a, int b) {
        ans = a + b;
    }
    public void sub(int a, int b) {
        ans = a - b;
    }
    public void mul(int a, int b) {
        ans = a * b;
    }
    public void div(int a, int b) {
        ans = a / b;
    }
    public void show() {
        System.out.println("ans=" + ans);
    }
}

public class Class04 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
