package com.ps.gocheers.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * A simple pager adapter that represents 5 {@link ScreenSlidePageFragment} objects, in
 * sequence.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

	public ScreenSlidePagerAdapter(android.support.v4.app.FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}/*

	*//**
	 * The number of pages (wizard steps) to show in this demo.
	 *//*
	private static final int NUM_PAGES = 5;
	public ScreenSlidePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return ScreenSlidePageFragment.create(position);
	}

	@Override
	public int getCount() {
		return NUM_PAGES;
	}
*/

	@Override
	public android.support.v4.app.Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}}
