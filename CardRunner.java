class CardRunner
{
	public static void main(String[] visiting)
	{
		System.out.println("main wedding card");
		Card.displaydetails();
		
		
		Card.Name="wedding card";
		Card.hight=80;
		Card.weight=100;
		Card.price=10;
	String[] ref = {"Red","Skyblue"};
		Card.colors = ref;
		
		Card.displaydetails();
		System.out.println("main:end of wedding card");
	}
}