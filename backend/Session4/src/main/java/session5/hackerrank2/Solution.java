package session5.hackerrank2;
interface AdvancedArithmetic{
    int divisorSum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1; i <= (n / 2); i++){ // Highest number can be dividend besides number itself is half of it.
            if((n % i) == 0 ) {
                sum += i;
            }
        }
        return (sum + n); // Finally add number itself to sum
    }
}
class Solution {
    public static void main(String[] args) {

    }
}

