package com.coll.OnlineCollaboration.service;

import java.util.List;

import com.coll.OnlineCollaboration.model.Blog;

public interface IBlogService {

	List<Blog> getAllBlogs();
	List<Blog> getBlogsByStatus(String status);
	List<Blog> getUsersBlogs(int id);
	List<Blog> mainList();
	Blog getBlogById(int blogId);
	boolean addBlog(Blog blog);
	boolean updateBlog(Blog blog);
	boolean deleteBlog(Blog blog);
}
