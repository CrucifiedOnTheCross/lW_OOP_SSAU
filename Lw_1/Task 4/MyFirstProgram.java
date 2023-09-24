import myfirstpackage.*;
class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass obj = new MySecondClass();
        System.out.println(obj.bitOr());

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                obj.setNumOne(i);
                obj.setNumTwo(j);
                System.out.print(obj.bitOr());
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

