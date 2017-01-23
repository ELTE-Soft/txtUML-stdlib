package hu.elte.txtuml.stdlib.util;

import java.util.HashMap;
import java.util.Set;
import hu.elte.txtuml.api.model.Collection;

public class HashMapImplementation implements hu.elte.txtuml.stdlib.util.HashMap {
	HashMap<String, String> hm;
	Collection<Entry> hash_entries = new Collection.Empty<>();

	private HashMapImplementation(HashMap<String, String> hm) {
		this.hm = hm;
	}

	public HashMapImplementation() {
		hm = new HashMap<String, String>();
	}

	public HashMap<String, String> put(String key, String value) {
		hm.put(key, value);
		return hm;
	}

	public void clear() {
		hm.clear();
	}

	public hu.elte.txtuml.stdlib.util.HashMap clone() {
		return new HashMapImplementation((HashMap<String, String>) hm.clone());
	}

	public boolean containsKey(String key) {
		return hm.containsKey(key);
	}

	public boolean containsValue(String value) {
		return hm.containsKey(value);
	}

	public String get(String key) {
		return hm.get(key);
	}

	public boolean isEmpty() {
		return hm.isEmpty();
	}

	public HashMap<String, String> remove(String key) {
		hm.remove(key);
		return hm;
	}

	public int size() {
		return hm.size();
	}

	public Collection<String> values() {
		return (Collection<String>) hm.values();
	}

	public Collection<String> keySet() {
		return (Collection<String>) hm.keySet();
	}

	public Collection<Entry> entrySet() {
		Set<java.util.Map.Entry<String, String>> hm2 = hm.entrySet();
		Collection<Entry> collection = new Collection.Empty<Entry>();
		for (java.util.Map.Entry<String, String> entry : hm2) {
			EntryImplementation myEntry = new EntryImplementation(entry.getKey(), entry.getValue());
			collection = collection.add(myEntry);
		}
		return collection;
	}
}
