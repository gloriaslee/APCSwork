/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class sumDigits {
    public int sumDigits(int n) {
        if (n < 10){
            return n;
        }
        else {
            return ((n % 10) + sumDigits(n / 10));
        }
    }
}
