package com.chandra.assignment.dataclasses;

import com.google.gson.Gson;

public class BookDataProvider {
	Gson gson = new Gson();
	
	public BookInfoList getAllBookInfo(String jsonData){
		BookInfoList tBookInfoList=new BookInfoList();
		tBookInfoList = (BookInfoList) gson.fromJson(jsonData,BookInfoList.class);
		return  tBookInfoList;
	}
}
