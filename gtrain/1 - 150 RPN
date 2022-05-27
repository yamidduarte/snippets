class Solution {
    
    private static final Map<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>();
    
    static {
        OPERATIONS.put("+", (a, b) -> a + b);
        OPERATIONS.put("-", (a, b) -> a - b);
        OPERATIONS.put("*", (a, b) -> a * b);
        OPERATIONS.put("/", (a, b) -> a / b);
    }    
    
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (String token : tokens) {
            
            if (!OPERATIONS.containsKey(token)) {
                stack.push(Integer.parseInt(token));
                continue;
            }
            
            var second = stack.pop();
            var first = stack.pop();
            
            var operation = OPERATIONS.get(token);
            stack.push(operation.apply(first, second));         
        }  
        return stack.pop();    
    }
}
