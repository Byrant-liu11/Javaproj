package task;

class Task1 {
    public Task1(String s){

        System.out.print("B");

    }

    public Task1() {

    }
}

class Derived extends Task1{

    public Derived (String s) {
        super();

        System.out.print("D");

    }

    public static void main(String[] args){

        new Derived("C");

    }
}
