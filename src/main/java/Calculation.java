public class Calculation {
    public int calc ( int number1, String operation, int number2)
    {
        int res = 0;
        switch (operation)
        {
            case "+":
                res = number1+number2;
                break;
            case "-":
                res = number1-number2;
                break;
            case "*":
                res = number1*number2;
                break;
            case "/":
                res = number1/number2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}

