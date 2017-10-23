package com.ea.objects.creativetabs;

import com.ea.init.ItemInit;
import com.ea.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EACreativeTab extends CreativeTabs {
	public EACreativeTab() {
		super(Reference.MODID + "1");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.OAK_WOOD_CHUNKS);
	}
}
