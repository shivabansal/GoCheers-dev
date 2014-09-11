package com.ps.gocheers;

import java.util.Timer;
import java.util.TimerTask;

import com.ps.gocheers.Utill.PreferenceKeys;
import com.ps.gocheers.Utill.SharedPreferenceManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SplashActivity extends Activity {
	private SharedPreferenceManager mSharedPreferenceManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		mSharedPreferenceManager = new SharedPreferenceManager(SplashActivity.this);
	}

	@Override
	protected void onResume() {

		Timer tm = new Timer();
		tm.schedule(new TimerTask() {

			@Override
			public void run() {
				checkifUserRegistered();
				fetchUserLocation();
			}
		}, 1000);
		super.onResume();
	}

	private void checkifUserRegistered(){
		Intent homeIntent= new Intent(SplashActivity.this, MainActivity.class);
		startActivity(homeIntent);
		finish();

		/*
		if(mSharedPreferenceManager.getBooleanData(PreferenceKeys.IS_REGISTERED)){
			Intent homeIntent= new Intent(SplashActivity.this, MainActivity.class);
			startActivity(homeIntent);
		} else {
			Intent homeIntent= new Intent(SplashActivity.this, FbLogin.class);
			startActivity(homeIntent);
		}
		finish();
		 */}

	private void fetchUserLocation(){

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_activity, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
