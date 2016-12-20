package hu.elte.txtuml.stdlib.io;

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;

import hu.elte.txtuml.api.model.Collection;


public class FileImplementation implements File {
	private java.io.File file;
	
	protected FileImplementation(java.io.File file) {
		this.file = file;
	}
	
	public FileImplementation(File parent, String child){
		this.file = new java.io.File(getOrigFile(parent), child);
	}
	
	protected static java.io.File getOrigFile(Object val) {
		if (val instanceof FileImplementation) {
			return ((FileImplementation) val).file;
		}
		else return null;
	}
	
	
	public FileImplementation(String pathname){
		this.file = new java.io.File(pathname);
	}
	
	public FileImplementation(String parent, String child){
		this.file = new java.io.File(parent, child);
	}
			
	public FileImplementation(URI uri){
		this.file = new java.io.File(uri);
	}

	@Override
	public boolean canExecute() {
		return file.canExecute();
	}

	@Override
	public boolean canRead() {
		return file.canRead();
	}

	@Override
	public boolean canWrite() {
		return file.canWrite();
	}

	@Override
	public int compareTo(File pathname) {
		return file.compareTo(getOrigFile(pathname));
	}

	@Override
	public boolean createNewFile() throws IOException {
		return file.createNewFile();
	}

	@Override
	public boolean delete() {
		return file.delete();
	}

	@Override
	public void deleteOnExit() {
		file.deleteOnExit();
	}

	@Override
	public boolean exists() {
		return file.exists();
	}

	@Override
	public File getAbsoluteFile() {
		return new FileImplementation(file.getAbsoluteFile());
	}

	@Override
	public String getAbsolutePath() {
		return file.getAbsolutePath();
	}

	@Override
	public File getCanonicalFile() throws IOException {
		return new FileImplementation(file.getCanonicalFile());
	}

	@Override
	public String getCanonicalPath() throws IOException {
		return file.getCanonicalPath();
	}

	@Override
	public long getFreeSpace() {
		return file.getFreeSpace();
	}

	@Override
	public String getName() {
		return file.getName();
	}

	@Override
	public String getParent() {
		return file.getParent();
	}

	@Override
	public File getParentFile() {
		return new FileImplementation(file.getParentFile());
	}

	
	public String getPath() {
		return null;
		
	}

	@Override
	public long getTotalSpace() {
		return file.getTotalSpace();
	}

	@Override
	public long getUsableSpace() {
		return file.getUsableSpace();
	}

	@Override
	public boolean isAbsolute() {
		return file.isAbsolute();
	}

	@Override
	public boolean isDirectory() {
		return file.isDirectory();
	}

	@Override
	public boolean isFile() {
		return file.isFile();
	}

	@Override
	public boolean isHidden() {
		return file.isHidden();
	}

	@Override
	public long lastModified() {
		return file.lastModified();
	}

	@Override
	public long length() {
		return file.length();
	}

	@Override
	public Collection<String> list() {
		String[] arr = file.list();
		Collection<String> result = new Collection.Empty<>();
		for (String temp : arr) result = result.add(temp);
		return result;
	}

	@Override
	public Collection<String> list(FilenameFilter filter) {
		String[] arr = file.list(filter);
		Collection<String> result = new Collection.Empty<>();
		for (String temp : arr) result = result.add(temp);
		return result;
	}

	@Override
	public Collection<File> listFiles() {
		java.io.File[] arr = file.listFiles();
		Collection<File> result = new Collection.Empty<>();
		for (java.io.File temp : arr) result = result.add(new FileImplementation(temp));
		return result;
	}

	@Override
	public Collection<File> listFiles(FileFilter filter) {
		java.io.File[] arr = file.listFiles(filter);
		Collection<File> result = new Collection.Empty<>();
		for (java.io.File temp : arr) result = result.add(new FileImplementation(temp));
		return result;
	}

	@Override
	public Collection<File> listFiles(FilenameFilter filter) {
		java.io.File[] arr = file.listFiles(filter);
		Collection<File> result = new Collection.Empty<>();
		for (java.io.File temp : arr) result = result.add(new FileImplementation(temp));
		return result;
	}

	@Override
	public boolean mkdir() {
		return file.mkdir();
	}

	@Override
	public boolean mkdirs() {
		return file.mkdirs();
	}

	@Override
	public boolean renameTo(File dest) {
		
		return file.renameTo(getOrigFile(dest));
	}

	@Override
	public boolean setExecutable(boolean executable) {
		return file.setExecutable(executable);
	}

	@Override
	public boolean setExecutable(boolean executable, boolean ownerOnly) {
		return file.setExecutable(executable, ownerOnly);
	}

	@Override
	public boolean setLastModified(long time) {
		return file.setLastModified(time);
	}

	@Override
	public boolean setReadable(boolean readable) {
		return file.setReadable(readable);
	}

	@Override
	public boolean setReadable(boolean readable, boolean ownerOnly) {
		return file.setReadable(readable, ownerOnly);
	}

	@Override
	public boolean setReadOnly() {
		return file.setReadOnly();
	}

	@Override
	public boolean setWritable(boolean writable) {
		return file.setWritable(writable);
	}

	@Override
	public boolean setWritable(boolean writable, boolean ownerOnly) {
		return file.setWritable(writable, ownerOnly);
	}

	@Override
	public Path toPath() {
		return file.toPath();
	}
	
	@Override
	public String toString() {
		return file.toString();
	}

}
