class ColorsRunner
{
	public static void main(String[] banna)
	{
		System.out.println("colors kannada");
		
		
		Colors.save("orange");
		Colors.save("white");
		Colors.save("green");
		Colors.save("red");
		Colors.save("blue");
		Colors.save("brown");
		Colors.save("purple");
		
		Colors.showDetails();
		
		
		boolean find=Colors.findcolor("white");
		System.out.println("Colors is type of arry: "+find);
		
	}
}