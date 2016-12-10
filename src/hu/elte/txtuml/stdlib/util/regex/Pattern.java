package RegularExpression;

import hu.elte.txtuml.api.model.external.ExternalClass;

import hu.elte.txtuml.api.model.Collection;

/**
 * @author Daphney
 *
 */
public interface Pattern extends ExternalClass{
	
	
	//Enables canonical equivalence.
	public static int CANON_EQ = PatternImplementation(java.util.regex.Pattern.CANON_EQ);
	
	//Enables case-insensitive matching.
	public static int CASE_INSENSITIVE = PatternImplementation(java.util.regex.Pattern.CASE_INSENSITIVE);
	
	//Permits whitespace and comments in pattern.
	public static int COMMENTS = PatternImplementation(java.util.regex.Pattern.COMMENTS);
	
	//Enables dotall mode.
	public static int DOTALL = PatternImplementation(java.util.regex.Pattern.DOTALL);
	
	//Enables literal parsing of the pattern.
	public static int LITERAL = PatternImplementation(java.util.regex.Pattern.LITERAL);
	
	//Enables multiline mode.
	public static int MULTILINE = PatternImplementation(java.util.regex.Pattern.MULTILINE);

	//Enables Unicode-aware case folding.
	public static int UNICODE_CASE = PatternImplementation(java.util.regex.Pattern.UNICODE_CASE);
	
	//Enables the Unicode version of Predefined character classes and POSIX character classes.
	public static int UNICODE_CHARACTER_CLASS = PatternImplementation(java.util.regex.Pattern.UNICODE_CHARACTER_CLASS);
	
	//Enables Unix lines mode.
	public static int UNIX_LINES = PatternImplementation(java.util.regex.Pattern.UNIX_LINES);
		
	
	
	/**
	 * Compiles the given regular expression into a pattern
	 * @see java.util.regex.Pattern.compile(String regex).
	 */
	public static Pattern compile(String regex) {
		return new PatternImplementation(java.util.regex.Pattern.compile(regex));
	}
	
	public static int PatternImplementation(int i){
		return i;
	}

	/**
	 * Compiles the given regular expression and attempts to match the given input against it.
	 * @see java.util.regex.Pattern.matches(String regex, CharSequence input).
	 */
	public static boolean matches(String regex, String input){
		return java.util.regex.Pattern.matches(regex, input);
	}
	 
	 /**
	  * Compiles the given regular expression into a pattern with the given flags.
	  * @see java.util.regex.Pattern.compile(String regex, int flags).	
	  */
	public static Pattern compile(String regex, int flags) {
		return new PatternImplementation(java.util.regex.Pattern.compile(regex, flags));	
	}
	
	/**
	 * This function returns a literal pattern String for the specified String.
	 * @see java.util.regex.Pattern.quote(String S)..
	 */
	public static String quote(String s){
		return java.util.regex.Pattern.quote(s);
	}
	
	public Collection<String> split(String input);
	public Collection<String> split(String input, int limit);
	public int flags();
	public String pattern();
	public String toString(); 
	public MatcherImplementation matcher(String input);
	
}

/*UnImplemented funtions 
public Predicate<String> asPredicate();
public Stream<String> splitAsStream(CharSequence input);*/
