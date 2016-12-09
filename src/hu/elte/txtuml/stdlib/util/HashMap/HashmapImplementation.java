package hu.elte.txtuml.stdlib.util.HashMap;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
//import java.util.Map.Entry;
import java.util.Set;
import hu.elte.txtuml.api.model.Collection;


public class HashmapImplementation implements Hashmap
{
	HashMap<String, String> hm;
	Collection<Entry> hash_entries = new Collection.Empty<>();
	
	
	private  HashmapImplementation(HashMap<String, String> hm) 
	{
		this.hm= hm;
	}
	
	public  HashmapImplementation() 
	{
		hm= new HashMap<String, String>();
	}
	
	
	@Override
	public HashMap<String, String> put(String key, String value) {
		hm.put(key, value);
		return hm;
	}
	
	
	@Override
	public void clear() {
		hm.clear();
		
	}
	
	
	@Override
	public Hashmap clone() 
	{
		return new HashmapImplementation((HashMap<String, String>) hm.clone());
	}
	
	
	@Override
	public boolean containsKey(String key) {
		return hm.containsKey(key);
	}

	
	@Override
	public boolean containsValue(String value) {
		return hm.containsKey(value);
	}
	
	
	@Override
	public String get(String key) 
	{
		return hm.get(key);
	}
	
	
	@Override
	public boolean isEmpty() {
		return hm.isEmpty();
	}
	
	
	@Override
	public HashMap<String, String> remove(Object key) {
		hm.remove(key);
		return hm;
	}
	
	@Override
	public int size() {
		return hm.size();
	}
	
	
	@Override
	public Collection<String> values() {
		return  (Collection<String>) hm.values();
	}

	
	@Override
	public Collection<String> keySet() {
		return (Collection<String>) hm.keySet();
	}


	@Override
	public Collection<Entry> entrySet() 
	{
		Set<java.util.Map.Entry<String, String>> hm2 = hm.entrySet();
		Collection<Entry> collection= new Collection.Empty<Entry>();
		 for(java.util.Map.Entry<String,String> entry : hm2)
		 {
			 
			 EntryImplementation myEntry = new EntryImplementation(entry.getKey(),entry.getValue());
			 collection=collection.add(myEntry);	
		 }
		return collection;
	}


}
