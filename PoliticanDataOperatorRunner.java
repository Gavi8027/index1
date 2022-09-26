class PoliticanDataOperatorRunner
{
	public static void main(String[] darshana)
	{
		System.out.println("election start aytu");
		
		PoliticanDataOperator.saveData("modi");
		PoliticanDataOperator.saveData("rahul");
		PoliticanDataOperator.saveData("siddu");
		PoliticanDataOperator.saveData("dk");
		PoliticanDataOperator.saveData("bommai");
		
	     PoliticanDataOperator.displaydetails();

          System.out.println("election end aytu");		 
	}
}