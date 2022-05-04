public class Medium {
  
  public String evaluate(String input) {
  
     //  b(o)a(t()(d(a)ys
    
    Deque<Integer> stack = new ArrayDeque<>();
    Set<Integer> toDelete = new HashSet<>();
    StringBuilder builder = new StringBuilder();
        
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(')
           stack.offerFirst(i);
        if (s.charAt(i) == ')' && stack.isEmpty())
           toDelete.add(i);
        if (s.charAt(i) == ')' && !stack.isEmpty())
            stack.pollFirst();      
    }
        
    while (!stack.isEmpty())
        toDelete.add(stack.pollFirst());
        
    for (int i = 0; i < s.length(); i++)
        if (!toDelete.contains(i))
           builder.append(s.charAt(i));        
        
    return String.valueOf(builder);
  }
}
