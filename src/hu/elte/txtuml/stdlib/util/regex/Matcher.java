package RegularExpression;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface Matcher extends ExternalClass{

	
	public Matcher appendReplacement(StringBuffer sb, String replacement);
	public StringBuffer appendTail(StringBuffer s);
	public int end();
	public int end(String name);
	public int end(int group);
	public boolean find(int start);
	public boolean find();
	public String group();
	public String group(int group);
	public String group(String group);
	public int groupCount();
	public boolean hasAnchoringBounds();
	public boolean hasTransparentBounds();
	public boolean hitEnd();
	public boolean lookingAt();
	public boolean matches();
	public Matcher	region(int start, int end);
	public int regionEnd();
	public int regionStart();
	public String replaceAll(String s);
	public String replaceFirst(String s);
	public boolean requireEnd();
	public Matcher reset();
	public Matcher reset(String input);
	public int start();
	public int start(int group);
	public int start(String name);
	public String toString();
	public Matcher useAnchoringBounds(boolean b);
	public Matcher useTransparentBounds(boolean b);
	
	//StringBufferType
	//public String appendTail(String s);
	//public Pattern pattern();
	//static String	quoteReplacement(String s);
	//Matcher results class
	//MatchResult	toMatchResult()
	//public Matcher usePattern(Pattern newPattern);
}
