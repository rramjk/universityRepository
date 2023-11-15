package university.programing;

public class Calculator {
    int a, b;
    Calculator(int num1, int num2){
        a = num1;
        b = num2;
    }
    int sum(){
        return a + b;
    }
    int div(){
        return a / b;
    }
    int minus(){
        return a - b;
    }
    int multip(){
        return a * b;
    }

}
