package com.example.flipperone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment3 extends Fragment {

	
	public static final String ARG_SECTION_NUMBER = "section_number";

	public MyFragment3() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment3, null);
			return v;
	}
}
