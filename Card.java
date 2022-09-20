class Card
{

		static String Name;
		static int hight;
		static int weight;
		static double price;
		static String[] colors;
		
		static void displaydetails()
	{
		System.out.println(Name);
		System.out.println(hight);
		System.out.println(weight);
		System.out.println(price);
		if(colors!=null)
		{
			System.out.println("adressing to memory");
			for (int index=0; index<colors.length; index++)
				{
					String ref=colors[index];
					System.out.println(ref);
	}
}
         else 
		 {
			 System.out.println("not adressing to memory");
		 }
	}
}