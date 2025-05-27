package org.example;

public class App {
    public int add(int a, int b) {
    return a+b;
    }

    public static void main(String[] args) {
        App a= new App();
        int res=a.add(2,3);
        System.out.println(res);
        System.out.println("executed success");
    }
}
