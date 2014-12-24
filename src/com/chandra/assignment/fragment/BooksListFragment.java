package com.chandra.assignment.fragment;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.chandra.assignment.R;
import com.chandra.assignment.adapter.BookListAdapter;
import com.chandra.assignment.dataclasses.BookDataProvider;
import com.chandra.assignment.dataclasses.BookInfoList;
import com.chandra.assignment.jsondata.BooksConfig;
import com.chandra.assignment.util.AssetsFileProvider;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
@SuppressLint("NewApi")
public class BooksListFragment extends Fragment{
	
	AssetsFileProvider mAssetsFileProvider;
	BookDataProvider mBookDataProvider;
	String mParsableString;
	BookInfoList mBookInfoList;
	BookListAdapter mBookListAdapter;
	ListView mBookInfoListView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		init();
	}
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    View rootView = inflater.inflate(R.layout.booklist_fragment_layout,
	        container, false);
	    mBookInfoListView=(ListView)rootView.findViewById(R.id.bookList);
	    mBookInfoListView.setAdapter(mBookListAdapter);
	    return rootView;
	  }
	
	private void init(){
		mAssetsFileProvider=new AssetsFileProvider(getActivity());
		mBookDataProvider=new BookDataProvider();
		mParsableString=mAssetsFileProvider.loadJSONFromAsset(BooksConfig.BOOK_DETAIL_FILE_NAME);
		mBookInfoList=mBookDataProvider.getAllBookInfo(mParsableString);
		mBookListAdapter=new BookListAdapter(getActivity(), mBookInfoList.getBooklist());
	}

}
