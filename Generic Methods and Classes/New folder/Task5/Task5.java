class Task5<K,V>{
	private K key;

	private V value;

	Task5(K key,V val){
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
	public String toString(){
		return ("Key is : "+this.getKey()+" The Value is : "+getValue());

	}

}