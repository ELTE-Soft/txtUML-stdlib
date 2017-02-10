package hu.elte.txtuml.stdlib.util.regex;

import hu.elte.txtuml.api.model.external.ExternalClass;

/**
 * Matcher is a txtUML extension of the class java.util.regex.Matcher
 * An engine that performs match operations on a character sequence by interpreting a Pattern.
 * A matcher is created from a pattern by invoking the pattern's matcher method.
 */
public interface Matcher extends ExternalClass{

	/**
	 * Implements a non-terminal append-and-replace step.
	 * @see java.util.regex.Matcher.appendReplacement(StringBuffer sb, String replacement).
	 */
	public Matcher appendReplacement(StringBuffer sb, String replacement);
	
	/**
	 * Implements a terminal append-and-replace step
	 * @see java.util.regex.Matcher.appendTail(StringBuffer s).
	 */
	public StringBuffer appendTail(StringBuffer s);
	
	/**
	 * Returns the offset after the last character matched.
	 * @see java.util.regex.Matcher.end().
	 */
	public int end();
	
	/**
	 * Returns the offset after the last character of the subsequence captured by the given capturing group.
	 * @see java.util.regex.Matcher.end(String name).
	 */
	public int end(String name);
	
	/**
	 * Returns the offset after the last character of the subsequence captured by the given group during the previous match operation.
	 * @see java.util.regex.Matcher.end(int group).
	 */
	public int end(int group);
	
	/**
	 * Resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index
	 * @see java.util.regex.Matcher.find(int start).
	 */
	public boolean find(int start);
	
	/**
	 * Find the next subsequence of the input sequence that matches the pattern.
	 * @see java.util.regex.Matcher.find().
	 */
	public boolean find();
	
	/**
	 * Returns the input subsequence matched by the previous match.
	 * @see java.util.regex.Matcher.group().
	 */
	public String group();
	
	/**
	 * Returns the input subsequence captured by the given group during the previous match operation. 
	 * @see java.util.regex.Matcher.group(int group).
	 */
	public String group(int group);
	
	/**
	 * Returns the input subsequence captured by the given named-capturing group during the previous match operation.
	 * @see java.util.regex.Matcher.group(String name).
	 */
	public String group(String name);
	
	/**
	 * Returns the number of capturing groups in this matcher's pattern.
	 * @see java.util.regex.Matcher.groupCount().
	 */
	public int groupCount();
	
	/**
	 * Queries the anchoring of region bounds for this matcher.
	 * @see java.util.regex.Matcher.hasAnchoringBounds().
	 */
	public boolean hasAnchoringBounds();
	
	/**
	 * Queries the transparency of region bounds for this matcher.
	 * @see java.util.regex.Matcher.hasTransparentBounds().
	 */
	public boolean hasTransparentBounds();
	
	/**
	 * Returns true if the end of input was hit by the search engine in the last match operation performed by this matcher.
	 * @see java.util.regex.Matcher.hitEnd(String name).
	 */
	public boolean hitEnd();
	
	/**
	 * Attempts to match the input sequence, starting at the beginning of the region, against the pattern. 
	 * @see java.util.regex.Matcher.lookingAt(String name).
	 */
	public boolean lookingAt();
	
	/**
	 * Returns the start index of the previous match.
	 * @see java.util.regex.Matcher.matches().
	 */
	public boolean matches();
	
	/**
	 * Sets the limits of this matcher's region.
	 * @see java.util.regex.Matcher.region(int start, int end). 
	 */
	public Matcher	region(int start, int end);
	

	/**
	 * Reports the end index (exclusive) of this matcher's region.
	 * @see java.util.regex.Matcher.regionEnd().
	 */
	public int regionEnd();
	
	/**
	 * Reports the start index of this matcher's region. 
	 * @see java.util.regex.Matcher.regionStart().
	 */
	public int regionStart();
	
	/**
	 * Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
	 *  @see java.util.regex.Matcher.replaceAll(String S).
	 */
	public String replaceAll(String s);
	
	/**
	 * Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
	 * @see java.util.regex.Matcher.replaceFirst(String S).
	 */
	public String replaceFirst(String s);
	
	/**
	 * Returns true if more input could change a positive match into a negative one. 
	 * @see java.util.regex.Matcher.requireEnd().
	 */
	public boolean requireEnd();
	
	/**
	 * Resets this matcher.
	 * @see java.util.regex.Matcher.reset().
	 */
	public Matcher reset();
	
	/**
	 * Resets this matcher with a new input sequence.
	 * @see java.util.regex.Matcher.reset(String input).
	 */
	public Matcher reset(String input);
	
	/**
	 * Returns the start index of the match.
	 * @see java.util.regex.Matcher.start().
	 */
	public int start();
	
	/**
	 * Returns the start index of the subsequence captured by the given group during the previous match operation.
	 * @see java.util.regex.Matcher.start(int group).
	 */
	public int start(int group);
	
	/**
	 * Returns the start index of the subsequence captured by the given named-capturing group during the previous match operation.
	 * @see java.util.regex.Matcher.start(String name).
	 */
	public int start(String name);
	public String toString();
	
	/**
	 *Sets the anchoring of region bounds for this matcher. 
	 * @see java.util.regex.Matcher.useAnchoringBounds(boolean b).
	 */
	public Matcher useAnchoringBounds(boolean b);
	
	/**
	 * Sets the transparency of region bounds for this matcher.
	 * @see java.util.regex.Matcher.useTransparentBounds(boolean b).
	 */
	public Matcher useTransparentBounds(boolean b);
	
	
}
