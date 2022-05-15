import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

    ArrayList<Integer> mouse = new ArrayList<Integer>();


  public void add( int x ) {
    if (mouse.size() == 0) {
      mouse.add(x);
    }
    if (x < mouse.get(mouse.size() - 1)) {
      mouse.add(x);
    }
    else {
      for (int i = 0; i < mouse.size(); i ++) {
        if (x > mouse.get(i)) {
          mouse.add(x, i);
        }
      }
    }
  }

  public boolean isEmpty() {
    return mouse.size() == 0;
  }

  public int peekMin() {
    if (mouse.size() == 0) {
      return 0;
    }
    return mouse.get(mouse.size()  - 1);
  }

  public int removeMin() {
    return mouse.remove(mouse.size() - 1);
  }

}
