package com.chandra.assignment.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.chandra.assignment.R;
import com.chandra.assignment.dataclasses.BookInfo;

public class BookListAdapter extends BaseAdapter{
	ViewHolder mViewHolder;
	LayoutInflater mInflater;
	List<BookInfo> mBookInfoList;
	
	public BookListAdapter(Context context,List<BookInfo> bookInfoList) {
		this.mInflater=LayoutInflater.from(context);
		this.mBookInfoList=bookInfoList;
	}
	
	@Override
	public int getCount() {
	
		return mBookInfoList.size();
	}

	@Override
	public Object getItem(int arg0) {
		
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		if(convertView==null || convertView.getTag()==null){
			convertView=mInflater.inflate(R.layout.item_booklist, null);
			mViewHolder=new ViewHolder();
			mViewHolder.bookTitle=(TextView)convertView.findViewById(R.id.bookTitle);
			mViewHolder.bookOthor=(TextView)convertView.findViewById(R.id.bookOthor);
			mViewHolder.bookContent=(TextView)convertView.findViewById(R.id.bookContent);
			convertView.setTag(convertView);
		}else{
			mViewHolder=(ViewHolder)convertView.getTag();
			
		}
		mViewHolder.bookTitle.setText(mBookInfoList.get(position).getHeading());
		mViewHolder.bookOthor.setText(mBookInfoList.get(position).getAuthor());
		mViewHolder.bookContent.setText(mBookInfoList.get(position).getContent());
		return convertView;
	}
	
	static class ViewHolder{
		TextView bookTitle;
		TextView bookOthor;
		TextView bookContent;
	}

}
