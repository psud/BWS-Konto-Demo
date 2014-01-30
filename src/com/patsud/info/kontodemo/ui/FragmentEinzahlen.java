package com.patsud.info.kontodemo.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.patsud.info.kontodemo.ItemDetailActivity;
import com.patsud.info.kontodemo.ItemListActivity;
import com.patsud.info.kontodemo.R;
import com.patsud.info.kontodemo.R.layout;
import com.patsud.info.kontodemo.content.ContentItems;

/**
 * A fragment representing a single Item detail screen. This fragment is either
 * contained in a {@link ItemListActivity} in two-pane mode (on tablets) or a
 * {@link ItemDetailActivity} on handsets.
 */
public class FragmentEinzahlen extends Fragment {
	public FragmentEinzahlen() {
	}

	
	private View v;
	
	private TextView title;
	private EditText name;
	private EditText kontonummer;
	private Button button;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.einzahlung,
				container, false);

		// Show the dummy content as text in a TextView.
//		if (mItem != null) {
//			((TextView) rootView.findViewById(R.id.item_detail))
//					.setText(mItem.content);
//		}
		Init();
		
		SetListeners();
		
		

		return v;
	}


	private void Init() {
		button = (Button) v.findViewById(R.id.einButton);
		title = (TextView) v.findViewById(R.id.einTitle);
		name = (EditText) v.findViewById(R.id.einKontoName);
		kontonummer = (EditText) v.findViewById(R.id.einKontoNr);
		
	}
	private void SetListeners() {
		String titleStr;
		titleStr = v.getResources().getString(R.string.uberweisung);
		titleStr = titleStr.toUpperCase();
		title.setText(titleStr);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				ButtonClicked();
			}
		});
		
	}

	protected void ButtonClicked() {
		// TODO Auto-generated method stub
		String nameStr;
		int nummerInt;
		
		nameStr = name.getText().toString();
		nummerInt = Integer.parseInt(kontonummer.getText().toString());
		
		Log.d("nameStr", String.valueOf(nameStr));
		Log.d("nummerInt", String.valueOf(nummerInt));
	}
}
