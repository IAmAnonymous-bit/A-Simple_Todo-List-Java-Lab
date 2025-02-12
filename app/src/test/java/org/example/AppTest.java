package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

  @BeforeEach
  void listWithOneCompleteTask()
  {
    TodoList one = new TodoList();
    Task o1 = new Task("A");
    one.add(o1);
    one.completeTask("A");
    
  }

}
