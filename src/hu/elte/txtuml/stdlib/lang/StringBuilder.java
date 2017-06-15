package hu.elte.txtuml.stdlib.lang;

import hu.elte.txtuml.api.model.External;
import hu.elte.txtuml.api.model.ExternalBody;
import hu.elte.txtuml.api.model.ModelClass;


public class StringBuilder extends ModelClass {

	
@External
java.lang.StringBuilder sb;

@ExternalBody
public StringBuilder() {
sb  = new java.lang.StringBuilder();
}


@ExternalBody
	public StringBuilder append(int i){
	 sb.append(i);
	 return this;
}

	/**
	 * Appends the String to the string builder.
	 * <p>
	 * 
	 * @param s
	 *            an String Object.
	 * @return a reference to this object.
	 */
@ExternalBody
	public StringBuilder append(String s){
		sb.append(s);
		return this;
	}


	/**
	 * Appends the string representation of the boolean argument to the
	 * sequence.
	 * 
	 * @param b
	 *            a boolean object
	 * @return a reference to this object.
	 */
@ExternalBody
	public StringBuilder append(boolean b){
		sb.append(b);
		return this;

	}

	/**
	 * Removes the characters in a substring of this sequence.The substring
	 * begins at the specified start and extends to the character at index end -
	 * 1 or to the end of the sequence if no such character exists. If start is
	 * equal to end, no changes are made.
	 * 
	 * @param start
	 *            The beginning index, inclusive.
	 * @param end
	 *            The ending index, exclusive.
	 * @return This object.
	 * @throws StringIndexOutOfBoundsException
	 *             if start is negative, greater than length(), or greater than
	 *             end.
	 */
@ExternalBody
	public StringBuilder deleteFromTo(int start, int end){
		sb.delete(start, end);
		return this;
	}
	/**
	 * Removes the char at the specified position in this sequence. This
	 * sequence is shortened by one char.
	 * 
	 * @param index
	 *            Index of char to remove
	 * @return This object.
	 * @throws StringIndexOutOfBoundsException
	 *             if the index is negative or greater than or equal to
	 *             length().
	 */
@ExternalBody
	public StringBuilder deleteCharAt(int index){
		sb.deleteCharAt(index);
		return this;
		
	}

	/**
	 * Inserts the string representation of the second int argument into this
	 * sequence.
	 * 
	 * @param offset
	 *            the offset.
	 * @param i
	 *            int Object
	 * @return
	 */
@ExternalBody
	public StringBuilder insert(int offset, int i){
		sb.insert(offset, i);
		return this;
	}

	/**
	 * Inserts the string representation of the boolean argument into this
	 * sequence.
	 * 
	 * @param offset
	 *            the offset.
	 * @param b
	 *            boolean Object
	 * @return This object
	 */
@ExternalBody
	public StringBuilder insert(int offset, boolean b){
		sb.insert(offset, b);
		return this;
	}

	/**
	 * Inserts the string into this character sequence.
	 * 
	 * @param offset
	 *            the offset.
	 * @param s
	 *            String Object
	 * @return This object
	 */
@ExternalBody
	public StringBuilder insert(int offset, String s){
		sb.insert(offset, s);
		return this;
	}

	/**
	 * Causes this character sequence to be replaced by the reverse of the
	 * sequence. If there are any surrogate pairs included in the sequence,
	 * these are treated as single characters for the reverse operation. Thus,
	 * the order of the high-low surrogates is never reversed.
	 * 
	 * @return a reference to this object.
	 */
@ExternalBody
	public StringBuilder reverse(){
		sb.reverse();
		return this;
	}

	/**
	 * Replaces the characters in a substring of this sequence with characters
	 * in the specified String.
	 * 
	 * @param start
	 *            The beginning index, inclusive.
	 * @param end
	 *            The ending index, exclusive.
	 * @param str
	 *            String that will replace previous contents.
	 * @return This object.
	 * @throws StringIndexOutOfBoundsException
	 *             if start is negative, greater than length(), or greater than
	 *             end.
	 */
@ExternalBody
	public StringBuilder replace(int start, int end, String str){
		sb.replace(start, end, str);
		return this;
	}

	/**
	 * Appends the string representation of the codePoint argument to this
	 * sequence.
	 * <p>
	 * The argument is appended to the contents of this sequence. The length of
	 * this sequence increases by Character.charCount(codePoint).
	 * 
	 * @param codePoint
	 *            a Unicode code point
	 * @return a reference to this object.
	 */

@ExternalBody
	public StringBuilder appendCodePoint(int codePoint){
		sb.appendCodePoint(codePoint);
		return this;
	}
	/**
	 * Sets the length of the character sequence. The sequence is changed to a
	 * new character sequence whose length is specified by the argument.
	 * 
	 * @param newLength
	 *            the new length
	 * @throws IndexOutOfBoundsException
	 *             if the newLength argument is negative.
	 */

@ExternalBody
	public void setLength(int newLength){
		sb.setLength(newLength);
	}

	/**
	 * Attempts to reduce storage used for the character sequence. If the buffer
	 * is larger than necessary to hold its current sequence of characters, then
	 * it may be resized to become more space efficient.
	 */

@ExternalBody
	public void trimToSize(){
		sb.trimToSize();
	}

	/**
	 * Ensures that the capacity is at least equal to the specified minimum.
	 * 
	 * @param minimumCapacity
	 *            the minimum desired capacity.
	 */

@ExternalBody
	public void ensureCapacity(int minimumCapacity){
		 sb.ensureCapacity(minimumCapacity);
	}

	/**
	 * Returns a string representing the data in this sequence. A new String
	 * object is allocated and initialized to contain the character sequence
	 * currently represented by this object. This String is then returned.
	 * Subsequent changes to this sequence do not affect the contents of the
	 * String.
	 * 
	 * @return a string representation of this sequence of characters.
	 */

@ExternalBody
	public String toString(){
		return sb.toString();
	}

	/**
	 * eturns a new String that contains a subsequence of characters currently
	 * contained in this sequence. The substring begins at the specified start
	 * and extends to the character at index end - 1.
	 * 
	 * @param start
	 *            The beginning index, inclusive.
	 * @param end
	 *            The ending index, exclusive.
	 * @return The new string.
	 * @throws StringIndexOutOfBoundsException
	 *             if start or end are negative or greater than length(), or
	 *             start is greater than end.
	 */

@ExternalBody
	public String substring(int start, int end){
		return sb.substring(start,  end);
	}

	/**
	 * Returns a new String that contains a subsequence of characters currently
	 * contained in this character sequence. The substring begins at the
	 * specified index and extends to the end of this sequence.
	 * 
	 * @param start
	 *            The beginning index, inclusive.
	 * @return The new string.
	 * @throws StringIndexOutOfBoundsException
	 *             if start is less than zero, or greater than the length of
	 *             this object.
	 */

@ExternalBody
	public String substring(int start){
		return sb.substring(start);
	}

	/**
	 * Returns the index within this sequence that is offset from the given
	 * index by codePointOffset code points. Unpaired surrogates within the text
	 * range given by index and codePointOffset count as one code point each.
	 * 
	 * @param index
	 *            the index to be offset
	 * @param codePointOffset
	 *            the offset in code points
	 * @return the index within this sequence
	 * @throws IndexOutOfBoundsException
	 *             if index is negative or larger then the length of this
	 *             sequence, or if codePointOffset is positive and the
	 *             subsequence starting with index has fewer than
	 *             codePointOffset code points, or if codePointOffset is
	 *             negative and the subsequence before index has fewer than the
	 *             absolute value of codePointOffset code points.
	 */

@ExternalBody
	public int offsetByCodePoints(int index, int codePointOffset){
		return sb.offsetByCodePoints(index, codePointOffset);
	}

	/**
	 * Returns the length (character count).
	 * 
	 * @return the length of the sequence of characters currently represented by
	 *         this object
	 */

@ExternalBody
	public int length(){
		return sb.length();
	}

	/**
	 * Returns the index within this string of the last occurrence of the
	 * specified substring.
	 * 
	 * @param str
	 *            the substring to search for.
	 * @param fromIndex
	 *            the index to start the search from.
	 * @return the index within this sequence of the last occurrence of the
	 *         specified substring.
	 * @throws NullPointerException
	 *             if str is null.
	 */

@ExternalBody
	public int lastIndexOf(String str, int fromIndex){
		return sb.lastIndexOf(str, fromIndex);
	}

	/**
	 * Returns the index within this string of the rightmost occurrence of the
	 * specified substring
	 * 
	 * @param str
	 *            the substring to search for.
	 * @return if the string argument occurs one or more times as a substring
	 *         within this object, then the index of the first character of the
	 *         last such substring is returned. If it does not occur as a
	 *         substring, -1 is returned.
	 * @throws NullPointerException
	 *             if str is null.
	 */

@ExternalBody
	public int lastIndexOf(String str){
		return sb.lastIndexOf(str);
	}

	/**
	 * Returns the index within this string of the first occurrence of the
	 * specified substring, starting at the specified index.
	 * 
	 * @param str
	 *            the substring for which to search.
	 * @param fromIndex
	 *            the index from which to start the search.
	 * @return the index within this string of the first occurrence of the
	 *         specified substring, starting at the specified index.
	 * @throws NullPointerException
	 *             if str is null.
	 */

@ExternalBody
	public int indexOf(String str, int fromIndex){
		return sb.indexOf(str, fromIndex);
	}

	/**
	 * Returns the index within this string of the first occurrence of the
	 * specified substring.
	 * 
	 * @param str
	 *            any string.
	 * @return if the string argument occurs as a substring within this object,
	 *         then the index of the first character of the first such substring
	 *         is returned; if it does not occur as a substring, -1 is returned.
	 * @throws NullPointerException
	 *             if str is null.
	 */

@ExternalBody
	public int indexOf(String str){
		return sb.indexOf(str);
	}

	/**
	 * Returns the number of Unicode code points in the specified text range of
	 * this sequence.
	 * 
	 * @param beginIndex
	 *            the index to the first char of the text range.
	 * @param endIndex
	 *            the index after the last char of the text range.
	 * @return the number of Unicode code points in the specified text range
	 */
@ExternalBody
	public int codePointCount(int beginIndex, int endIndex){
		return sb.codePointCount(beginIndex, endIndex);
	}

	/**
	 * Returns the character (Unicode code point) before the specified index.
	 * The index refers to char values (Unicode code units) and ranges from 1 to
	 * length().
	 * 
	 * @param index
	 *            the index following the code point that should be returned
	 * @return the Unicode code point value before the given index.
	 */

@ExternalBody
	public int codePointBefore(int index){
		return sb.codePointBefore(index);
	}

	/**
	 * Returns the character (Unicode code point) at the specified index. The
	 * index refers to char values (Unicode code units) and ranges from 0 to
	 * length() - 1.
	 * 
	 * @param index
	 *            the index to the char values
	 * @return the code point value of the character at the index
	 */

@ExternalBody
	public int codePointAt(int index){
		return sb.codePointAt(index);
	}

	/**
	 * Returns the current capacity. The capacity is the amount of storage
	 * available for newly inserted characters, beyond which an allocation will
	 * occur.
	 * 
	 * @return the current capacity
	 */

@ExternalBody
public int capacity(){
	return sb.capacity();
}
	
}
