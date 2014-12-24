/**
 * 
 */
package com.chandra.assignment.util;

import java.io.IOException;
import java.io.InputStream;

import android.content.Context;

/**
 * @author Ravishankar Ahirwar
 *
 */
public class AssetsFileProvider {
	Context mContext;
public AssetsFileProvider(Context context) {
	this.mContext=context;
}

	public String loadJSONFromAsset(String jsonFileName) {
	    String json = null;
	    try {

	        InputStream is = this.mContext.getAssets().open(jsonFileName);

	        int size = is.available();

	        byte[] buffer = new byte[size];

	        is.read(buffer);

	        is.close();

	        json = new String(buffer, "UTF-8");


	    } catch (IOException ex) {
	        ex.printStackTrace();
	        return null;
	    }
	    return json;

	}
	
}
