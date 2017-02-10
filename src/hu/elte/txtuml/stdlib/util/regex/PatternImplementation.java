package hu.elte.txtuml.stdlib.util.regex;

import hu.elte.txtuml.api.model.Collection;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternImplementation implements hu.elte.txtuml.stdlib.util.regex.Pattern{
	
	Pattern pattern;
	Matcher matcher;
	
	public PatternImplementation(){
	}
	
	public PatternImplementation(Pattern pattern){
		this.pattern = pattern;
	}

	public PatternImplementation(Matcher matcher){
		this.matcher = matcher;
	}
	
	@Override
	public int flags() {
		return pattern.flags();
	}
	
	@Override
	public String pattern() {
		return pattern.pattern();
	}
	
	@Override
	public Collection<String> split(String input) {
		String[] arr = pattern.split(input);
		Collection<String> result = new Collection.Empty<>();
			for (String s : arr) {
				result = result.add(s);
			}
		
		return result;
	}
	
	@Override
	public Collection<String> split(String input, int limit) {
		String[] arr = pattern.split(input, limit);
		Collection<String> result = new Collection.Empty<>();
			for (String s : arr) {
				result = result.add(s);
			}
		return result;
	}
	
	@Override
	public String toString() {
		return pattern.toString();
	}
	
	@Override
	public MatcherImplementation matcher(String input){
		MatcherImplementation myMatcher = new MatcherImplementation(pattern.matcher(input));
		return myMatcher;
	}
}
