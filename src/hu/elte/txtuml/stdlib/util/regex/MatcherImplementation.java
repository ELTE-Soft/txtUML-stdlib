package RegularExpression;

public class MatcherImplementation implements  Matcher{
	
	java.util.regex.Matcher matcher;
	
	public MatcherImplementation(java.util.regex.Matcher matcher){
		this.matcher = matcher;
	}
	public MatcherImplementation(){

	}
	/**
	 * Returns the start index of the match.
	 * @see java.util.regex.Matcher.start().
	 */
	@Override
	public int start() {
		return matcher.start();
	}

	/**
	 * Returns the offset after the last character matched.
	 * @see java.util.regex.Matcher.end().
	 */
	@Override
	public int end() {
		return matcher.end();
	}

	/**
	 * Find the next subsequence of the input sequence that matches the pattern.
	 * @see java.util.regex.Matcher.find().
	 */
	@Override
	public boolean find() {
		return matcher.find();
	}

	/**
	 * Returns the start index of the previous match.
	 * @see java.util.regex.Matcher.matches().
	 */
	@Override
	public boolean matches() {
		return matcher.matches();
	}

	/**
	 * Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
	 *  @see java.util.regex.Matcher.replaceAll(String S).
	 */
	@Override
	public String replaceAll(String S) {
		return matcher.replaceAll(S);
	}

	/**
	 * Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
	 * @see java.util.regex.Matcher.replaceFirst(String S).
	 */
	@Override
	public String replaceFirst(String S) {
		return matcher.replaceFirst(S);
	}

	/**
	 * Returns the offset after the last character of the subsequence captured by the given capturing group.
	 * @see java.util.regex.Matcher.end(String name).
	 */
	@Override
	public int end(String name) {
		return matcher.end(name);
	}

	/**
	 * Returns the offset after the last character of the subsequence captured by the given group during the previous match operation.
	 * @see java.util.regex.Matcher.end(int group).
	 */
	@Override
	public int end(int group) {
		return matcher.end(group);
	}

	/**
	 * Resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index
	 * @see java.util.regex.Matcher.find(int start).
	 */
	@Override
	public boolean find(int start) {
		return matcher.find(start);
	}

	/**
	 * Returns the input subsequence matched by the previous match.
	 * @see java.util.regex.Matcher.group().
	 */
	@Override
	public String group() {
		return matcher.group();
	}

	/**
	 * Returns the input subsequence captured by the given group during the previous match operation. 
	 * @see java.util.regex.Matcher.group(int group).
	 */
	@Override
	public String group(int group) {
		return matcher.group(group);
	}

	/**
	 * Returns the input subsequence captured by the given named-capturing group during the previous match operation.
	 * @see java.util.regex.Matcher.group(String name).
	 */
	@Override
	public String group(String name) {
		return matcher.group(name);
	}

	/**
	 * Returns the number of capturing groups in this matcher's pattern.
	 * @see java.util.regex.Matcher.groupCount().
	 */
	@Override
	public int groupCount() {
		return matcher.groupCount();
	}

	/**
	 * Queries the anchoring of region bounds for this matcher.
	 * @see java.util.regex.Matcher.hasAnchoringBounds().
	 */
	@Override
	public boolean hasAnchoringBounds() {
		return matcher.hasAnchoringBounds();
	}

	/**
	 * Queries the transparency of region bounds for this matcher.
	 * @see java.util.regex.Matcher.hasTransparentBounds().
	 */
	@Override
	public boolean hasTransparentBounds() {
		return matcher.hasTransparentBounds();
	}

	/**
	 * Returns true if the end of input was hit by the search engine in the last match operation performed by this matcher.
	 * @see java.util.regex.Matcher.hitEnd(String name).
	 */
	@Override
	public boolean hitEnd() {
		return matcher.hitEnd();
	}

	/**
	 * Attempts to match the input sequence, starting at the beginning of the region, against the pattern. 
	 * @see java.util.regex.Matcher.lookingAt(String name).
	 */
	@Override
	public boolean lookingAt() {
		return matcher.lookingAt();
	}

	/**
	 * Sets the limits of this matcher's region.
	 * @see java.util.regex.Matcher.region(int start, int end). 
	 */
	@Override
	public Matcher region(int start, int end) {
		return new MatcherImplementation(matcher.region(start, end));
	}

	/**
	 * Reports the end index (exclusive) of this matcher's region.
	 * @see java.util.regex.Matcher.regionEnd().
	 */
	@Override
	public int regionEnd() {
		return matcher.regionEnd();
	}

	/**
	 * Reports the start index of this matcher's region. 
	 * @see java.util.regex.Matcher.regionStart().
	 */
	@Override
	public int regionStart() {
		return matcher.regionStart();
	}

	/**
	 * Returns true if more input could change a positive match into a negative one. 
	 * @see java.util.regex.Matcher.requireEnd().
	 */
	@Override
	public boolean requireEnd() {
		return matcher.requireEnd();
	}

	/**
	 * Resets this matcher.
	 * @see java.util.regex.Matcher.reset().
	 */
	@Override
	public Matcher reset() {
		return new MatcherImplementation(matcher.reset());
	}

	/**
	 * Resets this matcher with a new input sequence.
	 * @see java.util.regex.Matcher.reset(String input).
	 */
	@Override
	public Matcher reset(String input) {
		return  new MatcherImplementation(matcher.reset(input));
	}

	/**
	 * Returns the start index of the subsequence captured by the given group during the previous match operation.
	 * @see java.util.regex.Matcher.start(int group).
	 */
	@Override
	public int start(int group) {
		return matcher.start(group);
	}

	/**
	 * Returns the start index of the subsequence captured by the given named-capturing group during the previous match operation.
	 * @see java.util.regex.Matcher.start(String name).
	 */
	@Override
	public int start(String name) {
		return matcher.start(name);
	}

	/**
	 *Sets the anchoring of region bounds for this matcher. 
	 * @see java.util.regex.Matcher.useAnchoringBounds(boolean b).
	 */
	@Override
	public Matcher useAnchoringBounds(boolean b) {		
		return  new MatcherImplementation(matcher.useAnchoringBounds(b));
	}

	/**
	 * Sets the transparency of region bounds for this matcher.
	 * @see java.util.regex.Matcher.useTransparentBounds(boolean b).
	 */
	@Override
	public Matcher useTransparentBounds(boolean b) {	
		return new MatcherImplementation(matcher.useTransparentBounds(b));
	}

	/**
	 * Implements a non-terminal append-and-replace step.
	 * @see java.util.regex.Matcher.appendReplacement(StringBuffer sb, String replacement).
	 */
	@Override
	public Matcher appendReplacement(StringBuffer sb, String replacement) {
		return  new MatcherImplementation(matcher.appendReplacement(sb, replacement));
	}
	
	/**
	 * Implements a terminal append-and-replace step
	 * @see java.util.regex.Matcher.appendTail(StringBuffer sb).
	 */
	@Override
	public StringBuffer appendTail(StringBuffer sb) {
	return matcher.appendTail(sb);
	}
}