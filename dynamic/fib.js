// memoization: store
// get results later

// let's use a HashMap equivalent in the programming language of your choice
// in js, let's use a js object, with keys being the arguments to our function, value will be the return value


const fib = (n, memo = {}) => {
  
    if(n in memo) return memo[n];
  
    if(n <= 2) return 1;
    
    memo[n] = fib(n - 1) + fib(n - 2);
  
    return memo[n];

};

console.log(fib(6));
console.log(fib(7));
console.log(fib(8));
