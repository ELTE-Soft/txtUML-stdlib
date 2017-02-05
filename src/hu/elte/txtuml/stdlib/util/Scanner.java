package hu.elte.txtuml.stdlib.util;

import java.io.File;
import java.io.FileNotFoundException;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface Scanner extends ExternalClass{
	/**
     * Constructs a new <code>Scanner</code> that produces values scanned
     * from the specified string.
     *
     * @param  source A string to scan
     */
	public void Scanner(String source);
	 
	 
	 /**
     * Returns true if this scanner has another token in its input.
     * This method may block while waiting for input to scan.
     * The scanner does not advance past any input.
     *
     * @return true if and only if this scanner has another token
     * @throws IllegalStateException if this scanner is closed
     * @see java.util.Iterator
     */
	public boolean hasNext();
	
	
	/**
     * Returns true if the next token matches the pattern constructed from the
     * specified string. The scanner does not advance past any input.
     *
     * An invocation of this method of the form hasNext(pattern)
     * behaves in exactly the same way as the invocation
     * hasNext(Pattern.compile(pattern)).
     *
     * @param pattern a string specifying the pattern to scan
     * @return true if and only if this scanner has another token matching
     *         the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
	public boolean hasNext(String pattern);
	
	
	/**
     * Returns true if the next token in this scanner's input can be
     * interpreted as an int value in the specified radix using the
     * {@link #nextInt} method. The scanner does not advance past any input.
     *
     * @param radix the radix used to interpret the token as an int value
     * @return true if and only if this scanner's next token is a valid
     *         int value
     * @throws IllegalStateException if this scanner is closed
     */
	public boolean hasNextInt(int radix);
	
	
	
	/**
     * Returns true if the next token in this scanner's input can be
     * interpreted as an int value in the default radix using the
     * {@link #nextInt} method. The scanner does not advance past any input.
     *
     * @return true if and only if this scanner's next token is a valid
     *         int value
     * @throws IllegalStateException if this scanner is closed
     */
	public boolean hasNextInt();
	
	
	/**
     * Returns true if there is another line in the input of this scanner.
     * This method may block while waiting for input. The scanner does not
     * advance past any input.
     *
     * @return true if and only if this scanner has another line of input
     * @throws IllegalStateException if this scanner is closed
     */
	public boolean hasNextLine();
	
	
	/**
     * Finds and returns the next complete token from this scanner.
     * A complete token is preceded and followed by input that matches
     * the delimiter pattern. This method may block while waiting for input
     * to scan, even if a previous invocation of {@link #hasNext} returned
     * <code>true</code>.
     *
     * @return the next token
     * @throws NoSuchElementException if no more tokens are available
     * @throws IllegalStateException if this scanner is closed
     * @see java.util.Iterator
     */
	public String next();
	
	
	/**
     * Scans the next token of the input as an <tt>int</tt>.
     *
     *  An invocation of this method of the form
     * nextInt() behaves in exactly the same way as the
     * invocation nextInt(radix), whereradix
     * is the default radix of this scanner.
     *
     * @return the int scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the Integer
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
	public int nextInt();
	
	
	/**
     * Scans the next token of the input as an <tt>int</tt>.
     * This method will throw <code>InputMismatchException</code>
     * if the next token cannot be translated into a valid int value as
     * described below. If the translation is successful, the scanner advances
     * past the input that matched.
     *
     *  If the next token matches the 
     * regular expression defined
     * above then the token is converted into an int value as if by
     * removing all locale specific prefixes, group separators, and locale
     * specific suffixes, then mapping non-ASCII digits into ASCII
     * digits via {@link Character#digit Character.digit}, prepending a
     * negative sign (-) if the locale specific negative prefixes and suffixes
     * were present, and passing the resulting string to
     * {@link Integer#parseInt(String, int) Integer.parseInt} with the
     * specified radix.
     *
     * @param radix the radix used to interpret the token as an int value
     * @return the <tt>int</tt> scanned from the input
     * @throws InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     * @throws NoSuchElementException if input is exhausted
     * @throws IllegalStateException if this scanner is closed
     */
	public int nextInt(int radix);
	
	
	
	/**
     * Advances this scanner past the current line and returns the input
     * that was skipped.
     *
     * This method returns the rest of the current line, excluding any line
     * separator at the end. The position is set to the beginning of the next
     * line.
     *
     * Since this method continues to search through the input looking
     * for a line separator, it may buffer all of the input searching for
     * the line to skip if no line separators are present.
     *
     * @return the line that was skipped
     * @throws NoSuchElementException if no line was found
     * @throws IllegalStateException if this scanner is closed
     */
	public String nextLine();
	
	
	/**
     * Returns the string representation of this Scanner. The
     * string representation of a Scanner contains information
     * that may be useful for debugging. The exact format is unspecified.
     *
     * @return  The string representation of this scanner
     */
	public String toString();
	
	
	/**
     * The remove operation is not supported by this implementation of
     * Iterator.
     *
     * @throws UnsupportedOperationException if this method is invoked.
     * @see java.util.Iterator
     */
	public void remove();
	
	/**
     * Resets this scanner.
     *
     *  Resetting a scanner discards all of its explicit state
     * information which may have been changed by invocations of {@link
     * #useDelimiter}, {@link #useLocale}, or {@link #useRadix}.
     *
     *  An invocation of this method of the form
     * scanner.reset()</tt> behaves in exactly the same way as the
     * invocation
     *
     * 
     *   scanner.useDelimiter("\\p{javaWhitespace}+")
     *          .useLocale(Locale.getDefault(Locale.Category.FORMAT))
     *          .useRadix(10);
     * 
     *
     * @return this scanner
     *
     * @since 1.6
     */
	public void reset();
	
	
	
	/**
     * Attempts to find the next occurrence of a pattern constructed from the
     * specified string, ignoring delimiters.
     *
     * An invocation of this method of the form findInLine(pattern)
     * behaves in exactly the same way as the invocation
     * findInLine(Pattern.compile(pattern))
     *
     * @param pattern a string specifying the pattern to search for
     * @return the text that matched the specified pattern
     * @throws IllegalStateException if this scanner is closed
     */
	public String findInLine(String pattern);
	
}
