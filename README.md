# Country-Code-Generator-
***********************************************
A program that generates a country code of a country according to which continent do belong .
///////////////////////////////////////////////
Implement a class named Country that contains:
 A String data field named countryName.
 An int data field named newID. This value will be automatically incremented with the 
creation of each Country object. The initial value of newID is 1. (Make sure to use the 
static property).
 A constant (final) int data field named COUNTRY_ID.
 A double data field named surfaceArea.
 An int data field named population.
 A String data field named countryCode.
 A constructor that creates a new country with specific name given as argument. Then, 
the country will be immediately assigned a COUNTRY_ID according to newID.
 The accessor (getter) methods for countryName and COUNTRY_ID.
 The accessor and mutator (setter) methods for surfaceArea and population data fields.
 The mutator method for countryCode that takes as argument a String named continent. 
This method will create a code to each country as following:
o The first 3 letters of the country name followed by a dash followed by the 
continent code (1 for Africa, 2 for Americas, 3 for Asia, 4 for Australia, and 5 for 
Europe) followed by a dash followed by the country ID.
 The accessor method for countryCode.
