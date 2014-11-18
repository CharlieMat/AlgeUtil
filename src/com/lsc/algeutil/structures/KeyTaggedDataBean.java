package com.lsc.algeutil.structures;

/**
 * This bean attaches a data with a key value
 * And the generateKey method makes the mapping can be customized disparately 
 * from the map class's default mapping. 
 * @author charlieliu
 *
 * @param <K>
 */
public class KeyTaggedDataBean<K,D> {
	
	protected K key;
	protected D data;
	
	public KeyTaggedDataBean(K key, D data) {
		super();
		this.key = key;
		this.data = data;
	}
	public K getKey(){
		return key;
	}
	public D getData(){
		return data;
	}
	public void setKey(K key){
		this.key = key;
	}
	public void setData(D data){
		this.data = data;
	}
	
	/**
	 * Generate a key using a given data
	 * @param data
	 * @return the key
	 */
	public K generateKey(D data){
		return key;
	}
}
