package prac;

public class CircularBuffer {
	private int capacity;
	private int head=0;
	private int tail=-1;
	private Object [] arr;
	
	public CircularBuffer(int capacity) {
		this.capacity=capacity;
		arr=new Object[capacity];
	}
	
	public void add(Object element) {
		int index=(tail+1)%capacity;
		arr[index]=element;
		tail++;
	}
	public Object getLast(int i) {
		int indexFromLast=(tail+capacity-i)%capacity;
		return arr[indexFromLast];
	}
	public static void main(String [] args) {
		CircularBuffer cl=new CircularBuffer(3);
		cl.add(7);
		cl.add(5);
		cl.add(8);
		cl.add(6);
		cl.add(4);
		cl.add(15);
		cl.add(18);
		cl.add(16);
		cl.add(41);
		
		System.out.println(cl.getLast(2));
	}
}
//Links used : https://www.youtube.com/watch?v=39HHWATPcwY (to understand circular buffer)
