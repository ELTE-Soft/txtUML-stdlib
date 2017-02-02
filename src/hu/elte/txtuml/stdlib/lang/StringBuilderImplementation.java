package hu.elte.txtuml.stdlib.lang;

public class StringBuilderImplementation implements StringBuilder {

	java.lang.StringBuilder sb = new java.lang.StringBuilder();

	public StringBuilderImplementation() {

	}

	public StringBuilderImplementation(java.lang.StringBuilder sb) {
		this.sb = sb;
	}

	@Override
	public StringBuilder append(int i) {
		return new StringBuilderImplementation(sb.append(i));

	}

	@Override
	public StringBuilder append(String s) {
		return new StringBuilderImplementation(sb.append(s));

	}

	@Override
	public StringBuilder append(boolean b) {
		return new StringBuilderImplementation(sb.append(b));
	}

	@Override
	public StringBuilder deleteFromTo(int start, int end) {
		return new StringBuilderImplementation(sb.delete(start, end));

	}

	@Override
	public StringBuilder insert(int offset, int i) {
		return new StringBuilderImplementation(sb.insert(offset, i));
	}

	@Override
	public StringBuilder insert(int offset, boolean b) {
		return new StringBuilderImplementation(sb.insert(offset, b));
	}

	@Override
	public StringBuilder insert(int offset, String s) {
		return new StringBuilderImplementation(sb.insert(offset, s));
	}

	@Override
	public String toString() {
		return sb.toString();
	}

	@Override
	public void trimToSize() {
		sb.trimToSize();
	}

	@Override
	public void setLength(int newLength) {
		sb.setLength(newLength);
	}

	@Override
	public void ensureCapacity(int minimumCapacity) {
		sb.ensureCapacity(minimumCapacity);
	}

	@Override
	public String substring(int start, int end) {
		return sb.substring(start, end);
	}

	@Override
	public String substring(int start) {
		return sb.substring(start);
	}

	@Override
	public StringBuilder reverse() {
		return new StringBuilderImplementation(sb.reverse());
	}

	@Override
	public int offsetByCodePoints(int index, int codePointOffset) {
		return sb.offsetByCodePoints(index, codePointOffset);
	}

	@Override
	public int length() {
		return sb.length();
	}

	@Override
	public int lastIndexOf(String str, int fromIndex) {

		return sb.lastIndexOf(str, fromIndex);
	}

	@Override
	public int lastIndexOf(String str) {

		return sb.lastIndexOf(str);
	}

	@Override
	public int indexOf(String str, int fromIndex) {

		return sb.indexOf(str, fromIndex);
	}

	@Override
	public int indexOf(String str) {
		return sb.indexOf(str);
	}

	@Override
	public int codePointCount(int beginIndex, int endIndex) {

		return sb.codePointCount(beginIndex, endIndex);
	}

	@Override
	public int codePointBefore(int index) {
		return sb.codePointBefore(index);
	}

	@Override
	public int codePointAt(int index) {
		return sb.codePointAt(index);
	}

	@Override
	public int capacity() {
		return sb.capacity();
	}

	@Override
	public StringBuilder deleteCharAt(int index) {
		return new StringBuilderImplementation(sb.deleteCharAt(index));
	}

	@Override
	public StringBuilder replace(int start, int end, String str) {
		return new StringBuilderImplementation(sb.replace(start, end, str));
	}

	@Override
	public StringBuilder appendCodePoint(int codePoint) {
		return new StringBuilderImplementation(sb.appendCodePoint(codePoint));
	}

}
