class TempleDataOperatorRunner
{
	public static void main(String[] darshana)
	{
		System.out.println("entered to temple");
		
		TempleDataOperator.saveData("Manjunatha temple","Dharmastala");
		TempleDataOperator.saveData("Venkateshwra temple","Tirupati");
		TempleDataOperator.saveData("Amjanaadri", "Gangavati");
		TempleDataOperator.saveData("Virupaksha Temple","Hampi");
		TempleDataOperator.saveData("Sharadambe Temple","Shrugeri");
		
	     TempleDataOperator.displayNmaes();

          System.out.println("exit from the temple");		 
	}
}