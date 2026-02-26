// Practice Fractional Knapsack
import java.util.ArrayList;
import java.util.Scanner;


class ItemValue 
{
		int value; 
		int weight;

		// Item value function
		public ItemValue(int val, int wt)
		{
			this.weight = wt;
			this.value = val;
		}

		public Double getPricePerVal()
		{
			return Double.valueOf((double)value/weight);
		}
}

public class GreedyKnapsack
{
	public static double getMaxValue(ArrayList<ItemValue> store, int capacity)
	{
		//Sorting items by value/weight ratio;
		store.sort((item1, item2)-> -item1.getPricePerVal().compareTo(item2.getPricePerVal()));
		int totalLoot = 0;

		for(ItemValue item : store){
			//Steal the whole item
			if(capacity - item.weight <= 0){
				capacity = capacity - item.weight;
				totalLoot = totalLoot + item.value;
			}
			//Cannot steal the whole item steal a fraction of it
			else{
				double fraction = (double) (capacity) / (double) item.weight;
				totalLoot += (fraction * item.value);
				capacity = (int) (capacity - (item.weight * fraction));
				break;
			}
		}
		return totalLoot;
	}
	
	public static void printInventory(ArrayList<ItemValue> store)
	{
		System.out.println("Printing the Inventory....");
		
		for(int item = 0; item < store.size(); ++item)
		{
			System.out.println("Item " + item + "\t Value: " + store.get(item).value + " \t Weight: " + store.get(item).weight);
		}
	}
	
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        ArrayList<ItemValue> store = new ArrayList<>();

        System.out.print("Enter the number of items you want to add: ");
        int numItems = scanner.nextInt();

        //User inputs items
        for (int i = 0; i < numItems; i++) 
		{
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("Enter value: ");
            int value = scanner.nextInt();

            System.out.print("Enter weight: ");
            int weight = scanner.nextInt();

            store.add(new ItemValue(value, weight));
        }

        //Input capacity
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        //Calculate max value
        double maxValue = getMaxValue(store, capacity);

        //Output
        printInventory(store);
        System.out.println("The value of the knapsack is: " + maxValue);

        scanner.close();
    }
}
