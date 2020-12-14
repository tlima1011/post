package entities;

public class Comment {
	
	//Atributos
	private String comments;

	//Construtores 
	public Comment(String comments) {
		
		this.comments = comments;
	} 
	//Getters and Setters 

	public String getComments() {
		return comments;
	}

	/*public void setComments(String comments) {
		this.comments = comments;
	}*/

	//Public String
	@Override
	public String toString() {
		return "\n"+getComments()+"\n";
	}
}
