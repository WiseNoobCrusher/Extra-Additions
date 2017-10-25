package com.ea.init;

import java.util.ArrayList;
import java.util.List;

import com.ea.objects.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	//Wood Chunks
	public static final Item OAK_WOOD_CHUNKS = new ItemBase("oak_chunks");
	public static final Item BIRCH_WOOD_CHUNKS = new ItemBase("birch_chunks");
	
}
