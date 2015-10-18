
public class UndeclaredIdentifierException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	
	public UndeclaredIdentifierException(String id){
		this.id = id;
	}
}