/*
Nora Miller, Gloria Lee, Ziying Jian (3 Lucky Duckies)
 APCS
 HW37 - PPMP[] Practicing Arrays
 2021-11-16
 time spent: 1 hrs
 
 QCC: the difference between [] and {}? How can we effectively layer if statements and else statements without making the code inefficient / complicated? How long should
 each of these problems be taking us? What is the most effective way to do each problem?
 DISCO: From piazza, you can only hardcode an array using {}. It's difficult finding the right combo of && and || if you have a lot of if and else statements 
 layered on top of each other. We should be careful to always initialize variables like counters before using them. We have to be careful to always return something, especially 
 when dealing with different branches of if/else statements.
 */

public int countEvens(int[] nums) {
	  int numEvens = 0; 
	  for (int x : nums) {
		if (x%2 == 0) {
		  numEvens +=1; 
		}
	  }
	  return numEvens; 
	}
