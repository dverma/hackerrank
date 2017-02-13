package challenges;

import java.util.*;


/*
 * Given dishes and its ingredients. Group dishes that has common ingredients
 * E.g:
		Input:
		"Pasta" -> ["Tomato Sauce", "Onions", "Garlic"]
		"Chicken Curry" --> ["Chicken", "Curry Sauce"]
		"Fried Rice" --> ["Rice", "Onions", "Nuts"]
		"Salad" --> ["Spinach", "Nuts"]
		"Sandwich" --> ["Cheese", "Bread"]
		"Quesadilla" --> ["Chicken", "Cheese"]
		
		Output: ("Pasta", "Fried Rice") ("Fried Rice, "Salad") , ("Chicken Curry", "Quesadilla") ("Sandwich", "Quesadilla")
 * 
 */
public class Ingredients
{
	public static void main(String[] args){
		
		Map<String, String[]> dishIngredientsMap = new HashMap<String, String[]>();
		String[] ing1 = {"Tomato Sauce", "Onions", "Garlic"};
		String[] ing2 = {"Chicken", "Curry Sauce"};
		String[] ing3 = {"Rice", "Onions", "Nuts"};
		String[] ing4 = {"Spinach", "Nuts"};
		String[] ing5 = {"Cheese", "Bread"};
		String[] ing6 = {"Chicken", "Cheese"};
		dishIngredientsMap.put("Pasta", ing1);
		dishIngredientsMap.put("Chicken Curry", ing2);
		dishIngredientsMap.put("Fried Rice", ing3);
		dishIngredientsMap.put("Salad", ing4);
		dishIngredientsMap.put("Sandwich", ing5);
		dishIngredientsMap.put("Quesadilla", ing6);
		
		printDishesWithCommonIngredients(dishIngredientsMap);
		
	}
	
	static void printDishesWithCommonIngredients(Map<String, String[]> dishIngredientsMap)
	{
		Map<String, Set<String>> ingDishMap = new HashMap<String, Set<String>>();
		//Iterate over the dishes
		for (String dish : dishIngredientsMap.keySet())
		{
			String[] ingredients = dishIngredientsMap.get(dish);
			//Iterate over the ingredients
			for (String ing : ingredients)
			{
				if (ingDishMap.containsKey(ing))
				{
					ingDishMap.get(ing).add(dish);
				}
				else
				{
					Set<String> dishSet = new HashSet<String>();
					dishSet.add(dish);
					ingDishMap.put(ing, dishSet);
				}
			}
		}
		for (Set<String> dishes : ingDishMap.values())
		{
			if (dishes.size() > 1)
				System.out.print(Arrays.toString(dishes.toArray())+" ");
		}
	}
	
}
