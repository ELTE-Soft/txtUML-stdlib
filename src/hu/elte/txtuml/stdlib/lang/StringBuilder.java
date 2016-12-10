package hu.elte.txtuml.stdlib.lang;

import hu.elte.txtuml.api.model.external.ExternalClass;

/**
 * This interface provide an interface so that StringBuilder can be used while
 * using TXTUML java.lang.StringBuilder class provides an API compatible with
 * StringBuffer, but with no guarantee of synchronization.
 * <p>
 * The principal operations on a StringBuilder are the append and insert
 * methods, which are overloaded so as to accept data of any type. Each
 * effectively converts a given datum to a string and then appends or inserts
 * the characters of that string to the string builder. The append method always
 * adds these characters at the end of the builder; the insert method adds the
 * characters at a specified point.
 * <p>
 * instances of StringBuilder are not safe for use by multiple threads. If such
 * synchronization is required then it is recommended that StringBuffer be used.
 * 
 * @author Sally Halal
 *
 */
public interface StringBuilder extends ExternalClass {

	/**
	 * Appends the string representation of the int argument.
	 * <p>
	 * The overall effect is exactly as if the argument were converted to a
	 * string by the method String.valueOf(int i), and the characters of that
	 * string were then appended to this character sequence.
	 * 
	 * @param i
	 *            an int Object.
	 * @return a reference to this object.
	 */
	public StringBuilder append(int i);

	/**
	 * Appends the String to the string builder.
	 * <p>
	 * 
	 * @param s
	 *            an String Object.
	 * @return a reference to this object.
	 */
	public StringBuilder append(String s);

	/**
	 * Appends the string representation of the boolean argument to the
	 * sequence.
	 * 
	 * @param b
	 *            a boolean object
	 * @return a reference to this object.
	 */
	public StringBuilder append(boolean b);

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
	public StringBuilder deleteFromTo(int start, int end);

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
	public StringBuilder deleteCharAt(int index);

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
	public StringBuilder insert(int offset, int i);

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
	public StringBuilder insert(int offset, boolean b);

	/**
	 * Inserts the string into this character sequence.
	 * 
	 * @param offset
	 *            the offset.
	 * @param s
	 *            String Object
	 * @return This object
	 */
	public StringBuilder insert(int offset, String s);

	/**
	 * Causes this character sequence to be replaced by the reverse of the
	 * sequence. If there are any surrogate pairs included in the sequence,
	 * these are treated as single characters for the reverse operation. Thus,
	 * the order of the high-low surrogates is never reversed.
	 * 
	 * @return a reference to this object.
	 */
	public StringBuilder reverse();

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
	public StringBuilder replace(int start, int end, String str);

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
	public StringBuilder appendCodePoint(int codePoint);

	/**
	 * Sets the length of the character sequence. The sequence is changed to a
	 * new character sequence whose length is specified by the argument.
	 * 
	 * @param newLength
	 *            the new length
	 * @throws IndexOutOfBoundsException
	 *             if the newLength argument is negative.
	 */
	public void setLength(int newLength);

	/**
	 * Attempts to reduce storage used for the character sequence. If the buffer
	 * is larger than necessary to hold its current sequence of characters, then
	 * it may be resized to become more space efficient.
	 */
	public void trimToSize();

	/**
	 * Ensures that the capacity is at least equal to the specified minimum.
	 * 
	 * @param minimumCapacity
	 *            the minimum desired capacity.
	 */
	public void ensureCapacity(int minimumCapacity);

	/**
	 * Returns a string representing the data in this sequence. A new String
	 * object is allocated and initialized to contain the character sequence
	 * currently represented by this object. This String is then returned.
	 * Subsequent changes to this sequence do not affect the contents of the
	 * String.
	 * 
	 * @return a string representation of this sequence of characters.
	 */
	public String toString();

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
	public String substring(int start, int end);

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
	public String substring(int start);

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
	public int offsetByCodePoints(int index, int codePointOffset);

	/**
	 * Returns the length (character count).
	 * 
	 * @return the length of the sequence of characters currently represented by
	 *         this object
	 */
	public int length();

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
	public int lastIndexOf(String str, int fromIndex);

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
	public int lastIndexOf(String str);

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
	public int indexOf(String str, int fromIndex);

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
	public int indexOf(String str);

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
	public int codePointCount(int beginIndex, int endIndex);

	/**
	 * Returns the character (Unicode code point) before the specified index.
	 * The index refers to char values (Unicode code units) and ranges from 1 to
	 * length().
	 * 
	 * @param index
	 *            the index following the code point that should be returned
	 * @return the Unicode code point value before the given index.
	 */
	public int codePointBefore(int index);

	/**
	 * Returns the character (Unicode code point) at the specified index. The
	 * index refers to char values (Unicode code units) and ranges from 0 to
	 * length() - 1.
	 * 
	 * @param index
	 *            the index to the char values
	 * @return the code point value of the character at the index
	 */
	public int codePointAt(int index);

	/**
	 * Returns the current capacity. The capacity is the amount of storage
	 * available for newly inserted characters, beyond which an allocation will
	 * occur.
	 * 
	 * @return the current capacity
	 */
	public int capacity();

}
