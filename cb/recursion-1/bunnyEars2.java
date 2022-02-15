/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class bunnyEars2 {
	public int bunnyEars2(int bunnies){
		if (bunnies == 0){
			return 0;
		}
		if (bunnies % 2 == 0){
			return bunnyEars2(bunnies - 1) + 3;
		}
		else {
			return bunnyEars2(bunnies - 1) + 2;
        }
	}
}
