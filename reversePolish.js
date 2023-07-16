var evalRPN = function(tokens) {
    if (tokens.length == 0) {
        return 0;
    }

    let stack = [];
    let result;
    for (i = 0; i < tokens.length; i ++) {
        if (!isOperator(tokens[i])) {
            stack.push(tokens[i]);
            console.log(stack);
        } else {
            let secondOperand = stack.pop() * 1;
            let firstOperand = stack.pop() * 1;
            result = calculate(tokens[i], firstOperand, secondOperand);
            stack.push(result);
            console.log(result);
        }
    }
    return result;
};
let isOperator = (token) => {
    if (token == "+" || token == "-" || token == "*" || token == "/") {
        return true
    } else {
        return false;
    }
}
let calculate = (token, first, second) => {
    if (token === "+") {
        return first  + second;
    } else if (token === "-") {
        return first  - second;
    } else if (token === "*") {
        return first * second;
    } else if (token === "/") {
        return  Math.trunc(first / second);
    } else {
        return 0;
    }
}
let tokens = ["4","13","5","/","+"]
console.log(evalRPN(tokens));