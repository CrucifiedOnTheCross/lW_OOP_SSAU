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

class MySecondClass {
    private int numOne;
    private int numTwo;

    int getNumOne() {
        return numOne;
    }

    int getNumTwo() {
        return numTwo;
    }

    void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    MySecondClass() {
        numOne = 0;
        numTwo = 0;
    }

    MySecondClass(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    int bitOr() {
        return numOne | numTwo;
    }
}