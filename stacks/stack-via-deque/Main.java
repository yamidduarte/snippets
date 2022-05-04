import java.util.Deque;

public class DequeExample {
  public static void main(String[] args) {
    Deque<Character> deque = ArrayDeque<>();

    // Queue mode
    deque.offerLast('a');
    deque.offerLast('b');

    String a = deque.pollFirst();
    String b = deque.pollFirst();

    // Stack mode
    deque.offerFirst('a');
    deque.offerFirst('b');

    String a = deque.pollFirst();
    String b = deque.pollFirst();

    // Implementation example

    Deque<Integer> stack = ArrayDeque<>();
    stack.push(1);
    stack.pop(1);
  
  }

}
