package descargas2y3;

public interface Identificable<T extends Comparable<T>> extends Comparable<Identificable<T>>{

	public T getId();
	
	public default int compareTo(Identificable<T> obj) {
		return getId().compareTo(obj.getId());
		
	}
	
}
