class ToothPaste
{
	static String Name;
	static String brand;
	static int price;
	static String color;
	static String flavor;
	static short length;
	static int width;
	static boolean salt;
	static short expiryYear;
	static String companyName;
	
	static void setName(String value)
	{
		Name=value;
	}	
	static void setbrand(String value)
	{
		brand=value;
	}
	static void setprice(int value)
	{
		price=value;
	}
	static void setcolor(String value)
	{
		color=value;
	}
	static void setflavor(String value)
	{
		flavor=value;
	}
	static void setlength(short value)
	{
		length=value;
	}
	static void setwidth(int value)
	{
		width=value;
	}
	static void setsalt(boolean value)
	{
		salt=value;
	}
	static void setexpiryYear(short value)
	{
		expiryYear=value;
	}
	static void setcompanyName(String value)
	{
	    companyName=value;
	}
	  /*static void showdetails()
	  {
	    System.out.println(Name);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(flavor);
		System.out.println(length);
		System.out.println(width);
		System.out.println(salt);
		System.out.println(expiryYear);
		System.out.println(companyName);
	  }*/
        static String getName()
	  {
		System.out.println("Name :"+Name);
			return Name;
	  }	  
	  static String getbrand()
	  {
		  System.out.println("brand: "+brand);
		  return brand;
	  }
	  static int getPrice()
	  {
		  System.out.println("price :"+price);
		  return price;
	  }
	  static String getcolor()
	  {
		  System.out.println("color :"+color);
		  return color;
	  }
	  static String getflavor()
	  {
		  System.out.println("flavor :"+flavor);
		  return flavor;
	
	  }
	  static short getlength()
	  {
		  System.out.println("length :"+length);
		 return length;
	  }
	  static int getwidth()
	  {
		  System.out.println("width :"+width);
		  return width;
	  }
	  static boolean getsalt()
	  {
		  System.out.println("salt :"+salt);
		 return salt;
	  }
	  static short getexpirYdate()
	  {
		  System.out.println("expirydate :"+expiryYear);
		  return expiryYear;
	  }
	  static String getcompanyName()
	  {
		  System.out.println("companyName :"+companyName);
		 return companyName;
	  }
}