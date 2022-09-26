class GraduateDataOperatorRunner
{
	public static void main(String[] degree)
	{
		System.out.println("start of college life");
		
		GraduateDataOperator.saveData("gavi");
		GraduateDataOperator.saveData("pavan");
		GraduateDataOperator.saveData("malya");
		GraduateDataOperator.saveData("anil");
		GraduateDataOperator.saveData("rames");
		
	     GraduateDataOperator.displayNmaes();

          System.out.println("end of college life");		 
	}
}