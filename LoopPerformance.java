public class LoopPerformance {
	public static void main(String[] args) {
		LoopPerformance.test2Loops(10000000);
	}
	
	public static void test2Loops(long upperBound){
		long dummyNum= 0;
		long start = System.nanoTime();
		for(long i=1; i<= upperBound; i++){
			dummyNum=i;
		}
		long end = System.nanoTime();
		long postIncrementTime=end-start;
		
		System.out.printf(dummyNum +" iterations with i++ took: %,35d\n", postIncrementTime);
		
		
		dummyNum= 0;
		start = System.nanoTime();
		for(long i=1; i<= upperBound; ++i){
			dummyNum=i;
		}
		end = System.nanoTime();
		long preIncrementTime=end-start;
		
		System.out.printf(dummyNum +" iterations with ++i took: %,35d\n", preIncrementTime);
		
		System.out.printf("Difference (post - pre): %,d  nanoseconds\n", (postIncrementTime-preIncrementTime));
	}
}