package com.chandra.assignment.dataclasses;

import java.util.ArrayList;
import java.util.List;

public class BookInfoList {
public List<BookInfo> booklist=new ArrayList<BookInfo>();

/**
 * @return the booklist
 */
public List<BookInfo> getBooklist() {
	return booklist;
}

/**
 * @param booklist the booklist to set
 */
public void setBooklist(List<BookInfo> booklist) {
	this.booklist = booklist;
}


}
