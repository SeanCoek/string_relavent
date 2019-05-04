package jsa.reflection.others;


import java.util.Random;

public class Tricky {

    String bar(int n, int k, String op) {
        if (k==0) return "";
        return op + n + "]" + bar(n-1, k-1, op) + " ";
    }

    String foo(int n) {
        StringBuffer b = new StringBuffer();
        if (n<2) b.append("(");
        for (int i=0; i<n; i++) b.append("(");
        String s = bar(n-1, n/2-1, "*").trim();
        String t = bar(n-n/2, n-(n/2-1), "+").trim();
        return b.toString()+n+(s+t).replace(']',')');
    }

    public void test() throws ClassNotFoundException {
        int n = new Random().nextInt();
        String result = new Tricky().foo(n);
        Class.forName(result);
    }
}
