package hu.elte.txtuml.stdlib.util.HashMap;
import java.util.HashMap;
import hu.elte.txtuml.api.model.Collection;
import hu.elte.txtuml.api.model.external.ExternalClass;

/**
 * HashMap to txtuml is a extension of the class java.util.HashMap. 
 * But specifically was create to use with < String,String >.
 * <p>
 * Hash table based implementation of the Map interface. 
 * This implementation provides all of the optional map operations, 
 * and permits null values and the null key. (The HashMap class is roughly 
 * equivalent to Hashtable, except that it is unsynchronized and permits nulls.) 
 * This class makes no guarantees as to the order of the map; in particular, it 
 * does not guarantee that the order will remain constant over time.
 * 
 * This implementation provides constant-time performance for the basic operations 
 * (get and put), assuming the hash function disperses the elements properly among the buckets. 
 * Iteration over collection views requires time proportional to the "capacity" of the HashMap
 * instance (the number of buckets) plus its size (the number of key-value mappings). 
 * Thus, it's very important not to set the initial capacity too high (or the load factor too low)
 * if iteration performance is important. 

 */
public interface Hashmap extends ExternalClass{
	/**
	 * Removes all of the mappings from this map. 
	 * The map will be empty after this call returns.
	 *
	 */
	public void clear();
	/**
	 * Returns a shallow copy of this HashMap instance: 
	 * the keys and values themselves are not cloned.
	 *
	 */
	public Hashmap clone();
	/**
	 * Returns true if this map contains a mapping for the specified key.
	 *
	 */
	public boolean containsKey(String key);
	/**
	 * Returns true if this map maps one or more keys to the specified value.
	 *
	 */
	public boolean containsValue(String value);
	/**
	 * Returns the value to which the specified key is mapped, 
	 * or null if this map contains no mapping for the key.
	 *
	 */
	public String get(String key);
	/**
	 * Returns true if this map contains no key-value mappings.
	 *
	 */
	public boolean isEmpty();
	/**
	 * Associates the specified value with the specified key in this map. 
	 * If the map previously contained a mapping for the key, the old value is replaced. 
	 *
	 */
	public HashMap<String, String> put(String key, String value);
	/**
	 * Removes the mapping for the specified key from this map if present.
	 *
	 */
	public HashMap<String, String> remove(String key);
	/**
	 * Returns the number of key-value mappings in this map.
	 *
	 */
	public int size();
	/**
	 *Returns a Collection view of the values contained in this map.
	 *
	 */
	public Collection<String> values();
	/**
	 * Returns a Collection view of the keys contained in this map. 
	 *
	 */
	public Collection<String> keySet();

	/**
	 * Returns a Collection of Entry of the mappings contained in this map. 
	 *
	 */
	public Collection<Entry> entrySet();

}
