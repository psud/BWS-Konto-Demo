package com.patsud.info.kontodemo.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.R;
import android.content.Context;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ContentItems {

	private Context c;
	
	public ContentItems(Context c){
		this.c = c;
	}
	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Item> ITEMS = new ArrayList<Item>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Item> ITEM_MAP = new HashMap<String, Item>();

	static {
		// Add 3 sample items.
		addItem(new Item("1", "bla"));
		addItem(new Item("2", "Item 2"));
		addItem(new Item("3", "Item 3"));
	}

	private static void addItem(Item item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Item {
		public String id;
		public String content;

		public Item(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
