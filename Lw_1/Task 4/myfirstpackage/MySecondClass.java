package myfirstpackage;

public class MySecondClass {
    private int numOne;
    private int numTwo;

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }

    public MySecondClass() {
        numOne = 0;
        numTwo = 0;
    }

    MySecondClass(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public int bitOr() {
        return numOne | numTwo;
    }
}