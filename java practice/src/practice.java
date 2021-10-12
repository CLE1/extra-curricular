public class practice {

    //    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;

        public int sumDouble ( int a, int b){
            // Store the sum in a local variable
            int sum = a + b;

            // Double it if a and b are the same
            if (a == b) {
                sum = sum * 2;
            }

            return sum;
        }


    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));

    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
