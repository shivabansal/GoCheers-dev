package com.ps.gocheers.Utill;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferenceManager {

	private SharedPreferences sharedPrefereces;
	private Editor editor;
	public SharedPreferenceManager(Context mContext){
		sharedPrefereces = mContext.getSharedPreferences(PreferenceKeys.APP_PREFERENCE_NAME, Context.MODE_PRIVATE);
	}

	public void setStringData(String key, String data){
		editor = sharedPrefereces.edit();
		editor.putString(key, data);
		editor.commit();
	}

	public String  getStringData(String key){
		return sharedPrefereces.getString(key, null);
	}

	public void setBooleanData(String key, Boolean data){
		editor = sharedPrefereces.edit();
		editor.putBoolean(key, data);
		editor.commit();
	}

	public boolean getBooleanData(String key){
		return sharedPrefereces.getBoolean(key, false);
	}

}
