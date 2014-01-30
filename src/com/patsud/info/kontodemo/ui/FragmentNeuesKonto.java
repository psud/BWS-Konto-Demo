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
public class FragmentNeuesKonto extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * 
	 * The dummy content this fragment is presenting.
	 */
	private ContentItems.Item mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public FragmentNeuesKonto() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = ContentItems.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	private View v;
	
	private TextView title;
	private EditText name;
	private EditText kundennummer;
	private Spinner spinner;
	private EditText kontostand;
	private Button button;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.neues_konto,
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
		button = (Button) v.findViewById(R.id.nkButton);
		title = (TextView) v.findViewById(R.id.nkTitle);
		spinner = (Spinner) v.findViewById(R.id.nkSpinner);
		name = (EditText) v.findViewById(R.id.nkEtName);
		kundennummer = (EditText) v.findViewById(R.id.nkTvNummer);
		kontostand = (EditText) v.findViewById(R.id.nkEtGeld);
		spinner = (Spinner) v.findViewById(R.id.nkSpinner);
		
		SetSpinner();
	}
	private void SetListeners() {
		String titleStr;
		titleStr = v.getResources().getString(R.string.neues_konto);
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
		String kontoTyp;
		double kontostand;
		
		nameStr = name.getText().toString();
		nummerInt = Integer.parseInt(kundennummer.getText().toString());
		kontoTyp = spinner.getSelectedItem().toString();
		kontostand = Double.parseDouble(this.kontostand.getText().toString());
		
		Log.d("nameStr", String.valueOf(nameStr));
		Log.d("nummerInt", String.valueOf(nummerInt));
		Log.d("kontoTyp", String.valueOf(kontoTyp));
		Log.d("kontostand", String.valueOf(kontostand));
	}

	private void SetSpinner() {
		// TODO Auto-generated method stub
		String giro;
		String spar;
		giro = v.getResources().getString(R.string.girokonto);
		spar = v.getResources().getString(R.string.sparkonto);

		String[] choice = {giro, spar};		
		
		ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, choice);
        spinner.setAdapter(spin_adapter);
        
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Log.d("spinner", String.valueOf(arg2));
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
