package org.zkoss.mvvm.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.zkoss.mvvm.collection.model.Item;
import org.zkoss.mvvm.collection.model.ItemService;

public class MultipleSelectionsVM {

	private ItemService itemService = new ItemService();
	private Set<Item> pickedItemSet = new HashSet<Item>();

	private int pickedIndex;
	private int pickedIndex2;
	private String pickedItem;
	
	public List<Item> getItemList(){
		return itemService.getAllItems();
	}

	public int getPickedIndex() {
		return pickedIndex;
	}

	public void setPickedIndex(int pickedIndex) {
		this.pickedIndex = pickedIndex;
	}

	public String getPickedItem() {
		return pickedItem;
	}

	public void setPickedItem(String pickedItem) {
		this.pickedItem = pickedItem;
	}

	public int getPickedIndex2() {
		return pickedIndex2;
	}

	public void setPickedIndex2(int pickedIndex2) {
		this.pickedIndex2 = pickedIndex2;
	}

	public Set getPickedItemSet() {
		return pickedItemSet;
	}

	public void setPickedItemSet(Set pickedItemSet) {
		this.pickedItemSet = pickedItemSet;
	}
	
}
