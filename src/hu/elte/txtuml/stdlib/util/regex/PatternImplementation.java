package RegularExpression;

import hu.elte.txtuml.api.model.Collection;

/**	
*An implementation of pattern Interface that represents Pattern.
*@see regular expression(regex) java.util.Regex 
*/
public class PatternImplementation implements Pattern{
	
	java.util.regex.Pattern pattern;
	java.util.regex.Matcher matcher;
	
	public PatternImplementation(){
	}
	
	public PatternImplementation(java.util.regex.Pattern pattern){
		this.pattern = pattern;
	}

	public PatternImplementation(java.util.regex.Matcher matcher){
		this.matcher = matcher;
	}
	
	/**
	 *Returns this pattern's match flags.
	 *@see java.util.regex.Pattern.flags(). 
	 */
	@Override
	public int flags() {
		return pattern.flags();
	}
	/**
	 * Returns the regular expression from which this pattern was compiled.
	 * @see java.util.regex.Pattern.pattern()
	 */
	@Override
	public String pattern() {
		return pattern.pattern();
	}
	
	/**
	 *Returns a literal pattern String for the specified input.
	 *@see java.util.regex.Pattern.split(String input). 
	 */
	@Override
	public Collection<String> split(String input) {
		String[] arr = pattern.split(input);
		Collection<String> result = new Collection.Empty<>();
			for (String s : arr) {
				result = result.add(s);
			}
		
		return result;
	}
	/**
	 * Splits the given input sequence around matches of this pattern. 
	 * @see java.util.regex.Pattern.split(String input, int limit).
	 */
	@Override
	public Collection<String> split(String input, int limit) {
		String[] arr = pattern.split(input, limit);
		Collection<String> result = new Collection.Empty<>();
			for (String s : arr) {
				result = result.add(s);
			}
		return result;
	}
	
	/**
	 * Returns the string representation of this pattern.
	 * @see java.util.regex.Pattern.toString().
	 */
	@Override
	public String toString() {
		return pattern.toString();
	}
	
	/**
	 * Creates a matcher that will match the given input against this pattern.
	 * @see java.util.regex.matcher(String input) 
	 */
	@Override
	public MatcherImplementation matcher(String input){
		MatcherImplementation myMatcher = new MatcherImplementation(pattern.matcher(input));
		return myMatcher;
	}
}

/*Unimpplemented functions
@Override
public Predicate<String> asPredicate(){
return pattern.asPredicate();

@Override
public Stream<String> splitAsStream(CharSequence input){
return pattern.splitAsStream(input);
}*/