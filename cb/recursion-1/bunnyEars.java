/*
Red Apples: Gloria Lee and Anjini Katari (with duckies Flounder and Watson)
APCS
HW64: Revisitation
2022-02-15
time spent: 1.5h
*/
public class bunnyEars{

	public int bunnyEars(int bunnies) {
		if (bunnies == 0) {
			return 0;
		}
		else{
			return (bunnyEars(bunnies - 1) + 2);
		}
	}

}
