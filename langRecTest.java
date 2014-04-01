

public class langRecTest {
    public static void main(String[] args) {

      int falsePositiveCount = 0;
      long AverageGibberishTime = 0;

      for (int i = 0; i<10; i++){
	long startTimeGibberish = System.nanoTime();

	for (String s: gibberishLibrary.gibberishArray){
	    //put mask you're testing here (in this case it's tenConsonants)
	    if(mask.tenConsonants(s)){
		//False Positives
		falsePositiveCount += 1;
	    }
	}

	long endTimeGibberish = System.nanoTime();
	long durationGibberish = endTimeGibberish - startTimeGibberish;
	AverageGibberishTime += durationGibberish;
	}

      double falsePositivePercentage = (falsePositiveCount/10) / 1000.0;
      System.out.printf("False Positive Rate: %.2f percent\n", falsePositivePercentage*100);
      System.out.printf("Time Taken (1000 strings): %.1f ms", (AverageGibberishTime/1000000.0));
  }
}
