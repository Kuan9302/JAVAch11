abstract class MyMath {
    protected int ans;
    public void show() {
        System.out.println("ans=" + ans);
    }
    public abstract void add(int a, int b); // 計算 a+b
    public abstract void sub(int a, int b); // 計算 a-b
    public abstract void mul(int a, int b); // 計算 a*b
    public abstract void div(int a, int b); // 計算 a/b
}

class Compute extends MyMath {
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
}

public class Class02 {
    public static void main(String args[]) {
        Compute cp = new Compute();
        cp.mul(3, 5);
        cp.show();
    }
}
