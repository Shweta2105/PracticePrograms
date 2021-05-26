package compackage;

public class headandTail {
	public static void main(String[] args) {
		
		int n=10;
		int head = 0;
		int tail = 0;
		for(int i=1;i<=n;i++) {
			double coin=Math.random();
			if(coin > 0.5) {
				head++;
				
			}
			else {
				
				tail++;
			}
		}
		//printing count
		System.out.println(" The heads is : " + head);
		System.out.println(" The tails is : " + tail);
		int percenthead = (head * 100) / 10;
		int percenttail = (tail * 100) / 10;

		System.out.println(" The percentage of heads is : " + percenthead);
		System.out.println(" The percentage of tails is : " + percenttail);	
	}


}
