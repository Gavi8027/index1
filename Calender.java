class Calender
{
   
     static String Name;
	 static int length;
	 static int width;
	 static int hight;
	 static int weight;
	 static String shape; 
	 static double daysperMonth;
	 static int months;
	 static int weeks;
	 static String color;
	 static boolean tag;
	 static boolean border;
	 static boolean paper;
	 static boolean rows;
	 static boolean column;
	 static boolean table;
	 static boolean picture;
	 static String[] Contents;
	 
	 
	 static void showdetails()
	 {
		 System.out.println(Name);
		 System.out.println(length);
		 System.out.println(width);
		 System.out.println(hight);
		 System.out.println(weight);
		 System.out.println(shape);
		 System.out.println(daysperMonth);
		 System.out.println(months);
		 System.out.println(weeks);
		 System.out.println(color);
		 System.out.println(tag);
		 System.out.println(border);
		 System.out.println(paper);
		 System.out.println(rows);
		 System.out.println(column);
		 System.out.println(table);
		 System.out.println(picture);
		 if(Contents!=null)
		 {
			 System.out.println("pointing to memory");
			 for(int g=0; g<Contents.length; g++)
			 {
				 String ref=Contents[g];
				 System.out.println(ref);
		 }
	
	 }
	 else
	 {
		 System.out.println("not pointing to memory");
	 }
}
}