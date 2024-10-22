import java.util.ArrayList;
class Task6<K,V>{
	private K key;

	private V value;

	Task6(K key,V val){
		setKey(key);
		setValue(val);

	}
	public void setKey(K key){
		this.key=key;
	}
	public void setValue(V val){
		this.value=val;
	}

	public K getKey(){
		return key;
	}
	public V getValue(){
		return value;
	}
	public void display(ArrayList<Task6> M){
		for(int i=0;i<M.size();i++){
			System.out.println("Key is :"+M.get(i).getKey());
			System.out.println("Value is :"+M.get(i).getValue());
		}
		

	}

}