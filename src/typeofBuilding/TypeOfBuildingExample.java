package typeofBuilding;

public class TypeOfBuildingExample {
	public static void main(String[] args) {
		BuildingType firstBuilding=new EducationalBuilding();
		BuildingType secondBuilding=new ResidentialBulding();
		
		
		firstBuilding.printBulidingDtails();
		System.out.println("\n");
		secondBuilding.printBulidingDtails();
		
		
	}
	
	
	
	

}

class BuildingType
{
	
	public void printBulidingDtails()
	{
	   	
	}
	
}
class EducationalBuilding extends BuildingType
{
	
   	@Override
   	public void printBulidingDtails() {
   		// TODO Auto-generated method stub
   		System.out.println("Educational Building Details:");
   		System.out.println("1) One Play Ground");
   		System.out.println("2) There Are Two Library");
   		System.out.println("3) There Are 300 Class Rooms");
   		System.out.println("4) Building Have Three Floor");
   		
   		
   	}
	
}

class ResidentialBulding extends BuildingType
{
	@Override
	public void printBulidingDtails() {
		// TODO Auto-generated method stub
		System.out.println("Residential Building Details:");
   		System.out.println("1) One Play Ground For Children");
   		System.out.println("2) GYM Space");
   		System.out.println("3) Library Area");
   		System.out.println("4) There are 500 rooms in Building");
   		System.out.println("5) Swimming Pool");
   		System.out.println("6) Seprated Parking Facilities for Four wheels and two Wheels");
   		System.out.println("7) Building Have eight Floor");
	}
}