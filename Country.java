
package Assignment_3.q1;

public class Country {
    String countryName;
    static int newId=1;
    final int COUNTRY_ID;
    double surfaceArea;
    int population ;
    String countryCode;

    public Country(String countryName) {
        this.countryName = countryName;
        this.COUNTRY_ID=newId++;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCOUNTRY_ID() {
        return COUNTRY_ID;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
    public String setCountryCode(String continent){
    String cName=getCountryName();
    countryCode=cName.substring(0, 3);
        if (continent.equalsIgnoreCase("afrcia")) {
        countryCode+="-1-"+COUNTRY_ID;    
        }
        else if(continent.equalsIgnoreCase("america")){
        countryCode+="-2-"+COUNTRY_ID;
        }
        else if(continent.equalsIgnoreCase("asia")){
        countryCode+="-3-"+COUNTRY_ID;
        }
        else if (continent.equalsIgnoreCase("australia")) {
        countryCode+="-4-"+COUNTRY_ID;
        }
        else if (continent.equalsIgnoreCase("europe")) {
        countryCode+="-5-"+COUNTRY_ID;
        }
    return countryCode;
    }
    public String getCountryCode(){
    return countryCode;
    }
    
    
}
