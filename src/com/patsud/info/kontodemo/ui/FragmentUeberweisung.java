package com.patsud.info.kontodemo.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.patsud.info.kontodemo.ItemDetailActivity;
import com.patsud.info.kontodemo.ItemListActivity;
import com.patsud.info.kontodemo.R;
import com.patsud.info.kontodemo.R.id;
import com.patsud.info.kontodemo.R.layout;
import com.patsud.info.kontodemo.content.ContentItems;

/**
 * A fragment representing a single Item detail screen. This fragment is either
 * contained in a {@link ItemListActivity} in two-pane mode (on tablets) or a
 * {@link ItemDetailActivity} on handsets.
 */
public class FragmentUeberweisung extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private ContentItems.Item mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public FragmentUeberweisung() {
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
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.uberweisung,
				container, false);

		

		return v;
	}
}
