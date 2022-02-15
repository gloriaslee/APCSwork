
/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class triangle{
    public int triangle(int rows) {
        if (rows == 0){
            return 0;
        }
        else {
            return (triangle(rows - 1) + rows);
        }
    }
}
