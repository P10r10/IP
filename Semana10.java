class Semana10 {
	
	static void tests(){
		int[] vec = {100, 200, 300, 150, 111};
		int[] vec2 = {150, 250, 350, 300};
//		IntSet mySet = new IntSet(3);
		IntSet mySet = new IntSet(vec);
//		mySet.doubleCapacity();
		IntSet mySet2 = new IntSet(vec2);
		IntSet lalal = mySet.intersection(mySet2);
		
		System.out.println();
	}

}
