package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

class AppTest {
  // Put your tests here!
  @Test
  void blankListAll()
  {
    TodoList blank = new TodoList();
    assertEquals(blank.all().size(), 0);
  }

  @Test 
  void blankListComplete()
  {
    TodoList blank = new TodoList();
    assertEquals(blank.complete().size(), 0);
  }

  @Test 
  void blankListIncomplete()
  {
    TodoList blank = new TodoList();
    assertEquals(blank.incomplete().size(), 0);
  }

  TodoList one;

  @BeforeEach
  void listWithOneCompleteTask()
  {
    one = new TodoList();
    Task a = new Task("A");
    one.add(a);
    one.completeTask("A");
    
  }

  @Test
  void oneListAll()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("A");
    assertEquals(one.all(), check);

  }

  @Test
  void oneListComplete()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("A");
    assertEquals(one.complete(), check);

  }

  @Test
  void oneListIncomplete()
  {
    assertEquals(one.incomplete().size(), 0);
    
  }

  @Test
  void clearOne()
  {
    one.clear();
    assertEquals(one.all().size(), 0);

  }

  TodoList two;

  @BeforeEach
  void listWithTwoIncompleteTasks()
  {
    two = new TodoList();
    Task b = new Task("B");
    Task c = new Task("C");
    two.add(b);
    two.add(c);
    
  }

  @Test
  void twoListAll()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("B");
    check.add("C");
    assertEquals(two.all(), check);

  }

  @Test
  void twoListComplete()
  {
    assertEquals(two.complete().size(), 0);
    
  }

  @Test
  void twoListIncomplete()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("B");
    check.add("C");
    assertEquals(two.incomplete(), check);
    
  }

  @Test
  void clearTwo()
  {
    two.clear();
    assertEquals(two.all().size(), 0);

  }

  TodoList five;

  @BeforeEach
  void listofFive()
  {
    five = new TodoList();
    Task d = new Task("D");
    Task e = new Task("E");
    Task f = new Task("F");
    Task g = new Task("G");
    Task h = new Task("H");
    five.add(d);
    five.add(e);
    five.add(f);
    five.add(g);
    five.add(h);
    five.completeTask("D");
    five.completeTask("F");
    five.completeTask("H");

  }

  @Test
  void fiveListAll()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("D");
    check.add("E");
    check.add("F");
    check.add("G");
    check.add("H");
    assertEquals(five.all(), check);
    
  }

  @Test
  void fiveListComplete()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("D");
    check.add("F");
    check.add("H");
    assertEquals(five.complete(), check);
    
  }

  @Test
  void fiveListIncomplete()
  {
    ArrayList<String> check = new ArrayList<String>();
    check.add("E");
    check.add("G");
    assertEquals(five.incomplete(), check);
    
  }

  @Test
  void clearFive()
  {
    five.clear();
    assertEquals(five.all().size(), 0);

  }


}
