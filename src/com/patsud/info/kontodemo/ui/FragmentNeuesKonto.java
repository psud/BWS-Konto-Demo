package com.patsud.info.kontodemo.ui;


import com.patsud.info.kontodemo.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentNeuesKonto extends Fragment{
	
	
	private View v;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		v = (ViewGroup) inflater.inflate(R.layout.neues_konto, container, false);

		Init();

		return v;
	}

	private void Init() {
		// TODO Auto-generated method stub
		
	}
}
