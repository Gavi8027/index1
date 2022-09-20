class CalenderRunner
{
	public static void main(String[] wall)
	{
		System.out.println("main: starts with jan");
		Calender.showdetails();
		
		Calender.Name="Shabadimatha";
		Calender.length=7;
		Calender.width=4;
		Calender.hight=12;
		Calender.weight=250;
		Calender.shape="Round";
		Calender.daysperMonth=30;
		Calender.months=12;
		Calender.weeks=7;
		Calender.color="white";
		Calender.tag= true;
		Calender.border= true;
		Calender.paper= true;
		Calender.rows= true;
		Calender.column= true;
		Calender.table= true;
		Calender.picture= true;
		String[] ref={"workingdays","govtholidays","astrology","directions","festivals","fair","openingdates","weddingdates","nationalfestivals","eclipse"};
		
		
		Calender.showdetails();
		System.out.println("main:ends with dec");
		
	}
}