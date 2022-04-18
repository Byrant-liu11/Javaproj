package bookSystem;

import operation.IOperation;

abstract class User {
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        this.operations[choice-1].work(bookList);
    }
}
