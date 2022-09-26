class FoodItemsDataOperator
{
   static String[] Names={null,null,null,null,null};
   static String[] Place={null,null,null,null,null};
     
    static int Position=0;
    
     static void saveData(String Name,String Place)
     {
		 Names[Position]=Name;
		 Place[Position]=name;
		 Position++;
		 
	 }	 
	 static void displayNames()
	 {
		 for(int index=0; index<Names.length; index++)
		 {
			 String ref=Names[index];
			 String ref1=Place[index];
			 System.out.println("Names : "+Names);
			 System.out.println("Place : "+Place);
		 }
	 }
}