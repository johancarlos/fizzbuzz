package fizzbuzz;

public class FizzBuzz {
	public String eval(int numToEval) {

        if(numToEval%15==0){
            return "FizzBuzz";
        }

        if(numToEval%5==0){
            return "Buzz";
        }

        if(numToEval%3==0){
            return "Fizz";
        }

        return String.valueOf(numToEval);
    }
}
