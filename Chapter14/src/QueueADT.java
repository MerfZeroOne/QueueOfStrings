public interface QueueADT<T> {
	/**
	 * Adds an element to the rear of the queue
	 * @param element : the element to be added to the end of the queue
	 */
	public void enqueue (T element);
	
	/**
	 * Removes and returns the element at the front of the queue
	 * @return the element at the front of the queue
	 */
	public T dequeue();
	
	/**
	 * returns the element at the front of this queue without removing it
	 * @return the first element in the queue
	 */
	public T first();
	
	/**
	 * Returns true if the queue returns no elements
	 * @return true if queue is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in the queue
	 * @return the integer representation of the size of the queue
	 */
	public int size();
	
	/**
	 * Returns a string representation of the queue.
	 * @return the string representation of the queue
	 */
	public String toString();
	
	
}
