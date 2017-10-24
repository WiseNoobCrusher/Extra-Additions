package com.ea.util.handlers;

import java.util.ArrayList;

import com.ea.util.AxeDamage;
import com.ea.util.DummyRecipe;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

public class CraftingHandler {
	
	public static void registerRecipes() {
		
	}
	
	public static void removeRecipes() {
		 ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		 ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());
		 
		 for (IRecipe r : recipes)
         {
             ItemStack output = r.getRecipeOutput();
             if (output.getItem() == Item.getItemFromBlock(Blocks.BREWING_STAND))
             {
                 recipeRegistry.remove(r.getRegistryName());
                 recipeRegistry.register(DummyRecipe.from(r));
             }
         }
	}
	
	public static void damageAxe() {
		 ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>)ForgeRegistries.RECIPES;
		 ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValues());
		 
		 for (IRecipe r : recipes)
        {
            ItemStack output = r.getRecipeOutput();
            if (output.getItem() == Item.getItemFromBlock(Blocks.PLANKS))
            {
                recipeRegistry.remove(r.getRegistryName());
                recipeRegistry.register(AxeDamage.from(r));
            }
        }
	}
	
	public CraftingHandler(ItemStack output) {
        AxeDamage.output = output;
    }
}
