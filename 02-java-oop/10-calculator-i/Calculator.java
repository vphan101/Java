public class Calculator {
    double operatorOne = 0;
    double operatorTwo = 0;
    char operation = ' ';
    double answer = 0;

    public Calculator(){

    }

    //Getters and Setters
    public double getOperatorOne(){
        return operatorOne;
    }
    public void setOperatorOne(double opOne){
        this.operatorOne = opOne;
    }

    public double getOperatorTwo(){
        return operatorTwo;
    }
    public void setOperatorTwo(double opTwo){
        this.operatorTwo = opTwo;
    }

    public char getOperation(){
        return operation;
    }
    public void setOperation(char operator){
        this.operation = operator;
    }

    public void performOperation(){
        switch(operation){
            case '+':
            answer = operatorOne + operatorTwo;
            break;
            case '-':
            answer = operatorOne - operatorTwo;
            break;
            default: break;
        }
    }

    public double getResults(){
        return answer;
    }

}
