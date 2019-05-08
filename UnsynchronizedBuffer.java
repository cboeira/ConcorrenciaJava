public class UnsynchronizedBuffer implements Buffer {
	private int buffer = -1;
	
	public void blockingPut(int value) throws InterrrupedException {
		System.out.printf("Producer writers\t%2d", value);
		buffer = value;
	}
	
	public int blockingGet() throws InterruptedException {
		System.out.printf("Consumer reads\t%2d", buffer);
		return buffer;
	}
}