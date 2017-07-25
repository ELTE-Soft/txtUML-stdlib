package hu.elte.txtuml.stdlib.util.regex;

import java.util.regex.Matcher;

public class MatcherImplementation implements hu.elte.txtuml.stdlib.util.regex.Matcher{
	
	Matcher matcher;
	
	public MatcherImplementation(Matcher matcher){
		this.matcher = matcher;
	}
	
	@Override
	public int start() {
		return matcher.start();
	}
	
	@Override
	public int end() {
		return matcher.end();
	}
	
	@Override
	public boolean find() {
		return matcher.find();
	}
	
	@Override
	public boolean matches() {
		return matcher.matches();
	}
	
	@Override
	public String replaceAll(String S) {
		return matcher.replaceAll(S);
	}
	
	@Override
	public String replaceFirst(String S) {
		return matcher.replaceFirst(S);
	}

	@Override
	public int end(String name) {
		return matcher.end(name);
	}

	@Override
	public int end(int group) {
		return matcher.end(group);
	}

	@Override
	public boolean find(int start) {
		return matcher.find(start);
	}

	@Override
	public String group() {
		return matcher.group();
	}

	@Override
	public String group(int group) {
		return matcher.group(group);
	}

	@Override
	public String group(String name) {
		return matcher.group(name);
	}

	@Override
	public int groupCount() {
		return matcher.groupCount();
	}

	@Override
	public boolean hasAnchoringBounds() {
		return matcher.hasAnchoringBounds();
	}

	@Override
	public boolean hasTransparentBounds() {
		return matcher.hasTransparentBounds();
	}

	@Override
	public boolean hitEnd() {
		return matcher.hitEnd();
	}

	@Override
	public boolean lookingAt() {
		return matcher.lookingAt();
	}

	
	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher region(int start, int end) {
		return new MatcherImplementation(matcher.region(start, end));
	}

	@Override
	public int regionEnd() {
		return matcher.regionEnd();
	}

	
	@Override
	public int regionStart() {
		return matcher.regionStart();
	}

	@Override
	public boolean requireEnd() {
		return matcher.requireEnd();
	}

	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher reset() {
		return new MatcherImplementation(matcher.reset());
	}

	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher reset(String input) {
		return  new MatcherImplementation(matcher.reset(input));
	}

	@Override
	public int start(int group) {
		return matcher.start(group);
	}

	@Override
	public int start(String name) {
		return matcher.start(name);
	}

	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher useAnchoringBounds(boolean b) {		
		return  new MatcherImplementation(matcher.useAnchoringBounds(b));
	}

	
	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher useTransparentBounds(boolean b) {	
		return new MatcherImplementation(matcher.useTransparentBounds(b));
	}

	@Override
	public hu.elte.txtuml.stdlib.util.regex.Matcher appendReplacement(StringBuffer sb, String replacement) {
		return  new MatcherImplementation(matcher.appendReplacement(sb, replacement));
	}
	
	@Override
	public StringBuffer appendTail(StringBuffer sb) {
	return matcher.appendTail(sb);
	}
}
