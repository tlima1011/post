package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment; 
	private String title; 
	private String content; 
	private Integer likes; 
	Date data = new Date();
	
	ArrayList <Comment> comments = new ArrayList<>();
	
	//Construtores 
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;  
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	//Getters and Setters 
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void addComment(Comment string) {
		comments.add(string);
		
	}
	//Public object to String 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append("\nTitle: " + title); 
		sb.append("\n" +likes +" Likes\n");
		sb.append("Stars: ");
		for(int i = 1; i <= likes;i++) {
			sb.append("*");
		}
		sb.append("\nDate Moment: " +sdf.format(moment));
		sb.append("\nContent: " +content); 
		sb.append("\nComments:");
		for(Comment c : comments) {
			sb.append("\n"+c.getComments());
		}
		return sb.toString(); 
	}
}
