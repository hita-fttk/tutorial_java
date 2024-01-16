package exception_sample;

public class Calculation {
    public int execute(int firstNum, char operator, int secondNum) throws ArithmeticException{
        if(operator == '+'){
            return firstNum+secondNum;
        }else if(operator == '-'){
            return firstNum - secondNum;
        }else if(operator == '*'){
            return firstNum*secondNum;
        }else if(operator == '÷'){
            return firstNum/secondNum;
        }else{
                throw new ArithmeticException();
        }
    }
}
