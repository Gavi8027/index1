class FoodItemsDataOperatorRunner
{
	public static void main(String[] tiffin)
	{
		System.out.println("entered to hotel");
		
		FoodItemsDataOperator.saveData("pongal");
		FoodItemsDataOperator.saveData("puri");
		FoodItemsDataOperator.saveData("idli");
		FoodItemsDataOperator.saveData("paddu");
	    FoodItemsDataOperator.saveData("dosa");
		
	      FoodItemsDataOperator.displayNmaes();

          System.out.println("exit from the hotel");		 
	}
}