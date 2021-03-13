public class Validation {
    public boolean checkLength(short n) {
        if (1 > n || n > 1000) {
            System.out.println("the number is too big or too small(1<n<1000). please try again!!");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkValues(int num) {
        if (num > (1000000000)) {
            System.out.println("the number can't be more than 1000,000,000 . please try again!!");
            return false;
        } else {
            return true;
        }
    }
}
