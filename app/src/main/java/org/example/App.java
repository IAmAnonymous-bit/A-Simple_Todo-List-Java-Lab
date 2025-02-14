package org.example;

public class App {
  public static void main(String[] args) {
    Task t = new Task("T");

    System.out.println(t.getName());
    System.out.println(t.isComplete());
    t.markAsComplete();
    System.out.println(t.isComplete());

    Task a = new Task("A");
    Task b = new Task("B");
    Task c = new Task("C");
    TodoList myList = new TodoList();
    myList.add(t);
    myList.add(a);
    myList.add(b);
    myList.add(c);
    myList.completeTask("B");
    myList.completeTask("I"); //Nothing should happen
    System.out.println(myList.all());
    System.out.println(myList.complete());
    System.out.println(myList.incomplete());
    myList.clear();
    System.out.println(myList.all());

  }
}
