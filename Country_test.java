
package Assignment_3.q1;

public class Country_test {
 public static void main(String [] args){
		Country leb=new Country("Lebanon");
                leb.setSurfaceArea(10452);
                leb.setPopulation(4882000);                
		Country fra=new Country("France");
                fra.setSurfaceArea(640679);
                fra.setPopulation(66616416);
		Country mex=new Country("Mexico");
		mex.setSurfaceArea(1972550);
                mex.setPopulation(118395054);
                
		System.out.println(leb.countryName+"'s population is "+leb.population+" and its code is "+leb.setCountryCode("Asia"));
		System.out.println(fra.countryName+"'s total area is "+fra.surfaceArea+" km squares and its code is "+fra.setCountryCode("Europe"));
		System.out.println(mex.countryName+"'s  ID is "+mex.getCOUNTRY_ID()+" and its code is "+mex.setCountryCode("America"));
	}   
}
