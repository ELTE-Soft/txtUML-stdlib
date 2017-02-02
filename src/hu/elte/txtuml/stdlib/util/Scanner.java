package hu.elte.txtuml.stdlib.util;

import java.io.File;
import java.io.FileNotFoundException;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface Scanner extends ExternalClass{
	/*
	Constructs a new Scanner that produces values scanned from the specified file.
	 */
	public void scanner(File file);
	/*
	Returns true if this scanner has another token in its input.
	 */
	public boolean hasNext();
	/*
	Returns true if the next complete token matches the specified pattern.
	 */
	public boolean hasNext(String pattern);
	/*
	Returns true if the next token in this scanner's input can be interpreted as an int value in the specified radix using the nextInt() method.
	 */
	public boolean hasNextInt(int radix);
	/*
	Returns true if the next token in this scanner's input can be interpreted as an int value in the default radix using the nextInt() method.
	 */

	public boolean hasNextInt();
	/*
	Returns true if there is another line in the input of this scanner.
	 */

	public boolean hasNextLine();
	/*
	Finds and returns the next complete token from this scanner.
	 */

	public String next();
	/*
	Scans the next token of the input as an int.
	 */

	public int nextInt();
	/*
	Scans the next token of the input as an int.
	 */

	public int nextInt(int radix);
	/*
	Advances this scanner past the current line and returns the input that was skipped.
	 */

	public String nextLine();
	/*
	Returns the string representation of this Scanner.
	 */

	public String toString();
	/*
	The remove operation is not supported by this implementation of Iterator.
	 */

	public void remove();
	/*
	Resets this scanner.
	 */

	public void reset();
	/*
	Attempts to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
	 */

	public String findInLine(String pattern);
	
}
