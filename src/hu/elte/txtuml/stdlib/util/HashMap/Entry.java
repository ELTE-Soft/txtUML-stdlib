package hu.elte.txtuml.stdlib.util.HashMap;

import hu.elte.txtuml.api.model.external.ExternalClass;
/**
 * Create to use in Hashmap to txtuml. Entry just handle the type String.
 * <p>
 * Returns a collection-view of the map, whose elements are of this class.
 * 
 * */
public interface Entry extends ExternalClass
{
	/**
	 Compares the specified object with this entry for equality.
	 */
	public boolean equals(Entry o);
	/**
	 Returns the key corresponding to this entry.
	 */
	public String getKey();
	/**
	 Returns the value corresponding to this entry.
	 */
	public String getValue();
	/**
	 Replaces the value corresponding to this entry with the specified value (optional operation).
	 */
 	public String setValue(String v);
 	
 	

}
