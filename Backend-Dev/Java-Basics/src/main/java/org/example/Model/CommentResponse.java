package org.example.Model;

import com.google.gson.annotations.SerializedName;

public class CommentResponse{

	private String name;

	private int postId;

	private int id;

	private String body;

	private String email;

	public String getName(){
		return name;
	}

	public int getPostId(){
		return postId;
	}

	public int getId(){
		return id;
	}

	public String getBody(){
		return body;
	}

	public String getEmail(){
		return email;
	}
}