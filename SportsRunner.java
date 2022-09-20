class SportsRunner
{
	public static void main(String[] dev)
	{
	System.out.println("teamMembers");
	String[] TeamMembersName={"sachin","dhoni","manish","virat","raina"};
	Sports.cricketTeamMembers(TeamMembersName);

     System.out.println("JerseyNos");
	int[] Numbers={11,22,33,44,55};
	Sports.kabbadiTeamMembersjerseNos(Numbers);
	
	System.out.println("salary");
	double[] Salary={18000,22000,32000,340000,41000};
	Sports.FootBallTeamMembersSalary(Salary);
	
	System.out.println("mobileNos");
	long[] MobileNos={9916763682l,9844647841l,9916177482l,9008841571l,9741330476l};
	Sports.LudoTeamMobileNumber(MobileNos);
	
	System.out.println("noOfMatches");
	int[] NoOfMatches={4,5,6,7,9};
	Sports.HockeyTeamMemberNoOfMatches(NoOfMatches);
	
	System.out.println("countryCode");
	long[] CountryCode={12426738,537389292,74836353,7389032,90386322};
	Sports.KhoKhoTeamMembersCountryCodes(CountryCode);
	}
}
	
