class Colors
{
   static String[] colorNames={null,null,null,null,null,null,null};	
   static int position=0;
   
   static void save(String light)
   {
	   Colors[position]=light;
	   position++;
   if(light==null&& light.length()>3)
		   {
			   System.out.println("light is pointing to null or not having more than 3 char");
		   }
		   
		   
		   else{
		   System.out.println("light is not pointing to null");
		   }
		   
		   
		   if(position>7){
		   System.out.println("light is required to see the color");
		   }
		   
		   
		   else{
		   System.out.println("light is not required to see the color");
		   }
		   }
		   
		   
		   static void showDetails()
		   {
			 for(int g=0; g<Colors.length){
		    String ref=Colors[g];
		    System.out.println("light colors : "+ref);
			   }
		   }
		   
		   
		   static boolean findColor(String Color)
		   {
		   if(Color!=null && Color.length()>3)
		   {
		    System.out.println("correct color");
		    for(int find=0; find<Colors.length)
		    {
		    String ref=Colors(find);
			if(ref==Colors)
		    {
		    System.out.println("color is type of arry");
			  return true;
			 }
		     else
			 {
			 System.out.println("color is not type of arry");
			 return false;
				}
			  }
			 }
		   }
		   
}
			   