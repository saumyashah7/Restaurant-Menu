package com.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.restaurant.model.Comment;
import com.restaurant.utils.DBConnection;

public class CommentDAOImpl implements CommentDAO {
	
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
	@Override
	public void addComment(Comment c) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO comment(title, description) VALUES"
					+ "('"+c.getTitle()+"','"+c.getDescription()+"')";
			connection = DBConnection.openConnection();
			System.out.println(sql);
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		
	}

	@Override
	public List<Comment> getComments() {
		// TODO Auto-generated method stub
		List<Comment> comments=null;
		Comment c=null;
		try {	
			comments=new ArrayList<>();
			String sql = "SELECT * FROM comment";
			connection = DBConnection.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				c = new Comment();
				c.setId(resultSet.getInt("id"));
				c.setTitle(resultSet.getString("title"));
				c.setDescription(resultSet.getString("description"));
				comments.add(c);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return comments;
	}
	
	

}
