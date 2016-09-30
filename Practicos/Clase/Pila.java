public class Pila{
	private int arr[] = null;
	private int size = null;
	private int actualSize = null;

	public Pila(int size){
		this.arr = new int[size];
		this.size = size;
		this.actualSize = 0;
	}

	public void push(int value){
		this.arr[actualSize] = value;
	}
	public void pop(){}
	public void push(){}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < this.arr.length ; i++ ) {
			if (i != this.arr.length-1) {
				str.append(this.arr[i]+",");
			} else {
				str.append(this.arr[i]);
			}

		}
		str.append("]");
		return str.toString();
	}
}