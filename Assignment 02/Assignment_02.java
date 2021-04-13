public class Assignment_02 extends Thread{
	public static void main(String[] args) throws InterruptedException {

//==================================================================// Even Counter
		Runnable R1 = ()->{
            System.out.println("\n\nEven Program Thread running...");

            int countEvens = 0;

            for (int i = 1; i <= 1000 ; i++) {
				if (i % 2 == 0) {
					countEvens = countEvens + 1;
				}
			}
			System.out.println("There are " + countEvens + " Even Numbers in the Range 1 - 1000.");
    	};
//==================================================================// Prime Counter
    	Runnable R2 = ()->{
    		System.out.println("\n\nPrime Program Thread running...");

    		int countPrimes = 0;

    		for (int num = 2; num <= 1000; num++) {
				boolean flag = false;
				
				for (int i = 2; i <= num / 2; ++i) {				// condition for nonprime number
					if (num % i == 0) {
						flag = true;
						break;
					}
				}

				if (!flag)
				countPrimes = countPrimes + 1;
				// System.out.println(num + " is a prime number.");
				// else
				// System.out.println(num + " is not a prime number.");

			}
			System.out.println("There are " + countPrimes + " Prime Numbers in the Range 1 - 1000.\n");
    	};
//==================================================================// Thread Handling
    	Thread ThreadEvenP = new Thread(R1);
    	ThreadEvenP.start();
    	ThreadEvenP.join();

    	Thread ThreadPrimeP = new Thread(R2);
    	ThreadPrimeP.start();
	}
}