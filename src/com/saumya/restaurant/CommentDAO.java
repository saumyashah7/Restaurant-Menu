package com.saumya.restaurant;

import java.util.List;

public interface CommentDAO {
	
	public void addComment(Comment c);
	public List<Comment> getComments();

}
