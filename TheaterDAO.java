package com.java.movie;

import java.util.List;

interface TheaterDAO {
	public void AddTheater();
	public Theater viewTheater(int theaterID);
	public void Updatetheater(int theaterID);
	public List<Theater> viewallTheater();
	public void deleteTheater();
	public void back();
	

	
	


	
}
