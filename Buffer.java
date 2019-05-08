public interface Buffer {
	public void blockingPut(int value) throws InterrupedException;
	
	public int blockingGet() throws InterrupedException;	
}