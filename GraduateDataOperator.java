class GraduateDataOperator
{
   static String[] Names={null,null,null,null,null};
     
    static int Position=0;
    
     static void saveData(String Name)
     {
		 Names[Position]=Name;
		 Position++;
		 
	 }	 
	 static String displayNames()
	 {
		 for(int index=0; index<Names.length; index++)
		 {
			 String ref=Names[index];
			 System.out.println("Names : "+Names);
			 return "completed";
		 }
		 return null;
	 }
}