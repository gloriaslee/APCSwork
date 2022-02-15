/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class count7{   
    public int count7(int n){
        if (n < 10 && n == 7) {
            return 1; 
        }
        else if (n < 10 && n != 7){
            return 0;
        }
        else {
            return (count7(n % 10) + count7(n / 10));
        }
    }
}
