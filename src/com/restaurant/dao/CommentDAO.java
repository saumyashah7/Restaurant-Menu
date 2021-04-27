package com.restaurant.dao;

import java.util.List;

import com.restaurant.model.Comment;

public interface CommentDAO {
	
	public void addComment(Comment c);
	public List<Comment> getComments();

}
