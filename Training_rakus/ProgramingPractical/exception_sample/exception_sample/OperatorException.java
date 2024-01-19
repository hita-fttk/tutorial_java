package exception_sample;

public class OperatorException extends Exception {
    OperatorException(){}
    OperatorException(String message){
        super(message);
    }
    // OperatorException(Throwable cause){
    //     super(cause);
    // }
    public int execute(int firstNum, char operator, int secondNum) throws OperatorException{
        if(operator == '+'){
            return firstNum+secondNum;
        }else if(operator == '-'){
            return firstNum - secondNum;
        }else if(operator == '*'){
            return firstNum*secondNum;
        }else if(operator == '÷'){
            return firstNum/secondNum;
        }else{
                throw new OperatorException("不正な演算子が使用されました");
                
        }
    }
}
