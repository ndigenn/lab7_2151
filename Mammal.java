
/**
 * @invariant legCount must be >= 0
 *
 * @corresponds common_name = commonName AND  genus_name = genus AND species_name = species AND leg_count = legCount
 *
 */
public class Mammal implements IMammal{

    private String commonName;
    private String genus;
    private String species;
    private int legCount;

    /**
	 * Constructs a mammal that sets the commonName, genus, species, and legCount
	 *
	 * @param aCommonName - the common name of the animal, a String
	 * @param aGenus -  the genus of the animal, a String
     * @param aSpecies -  the species of the animal , a String
     * @param aLegCount -  the leg count of an animal, an int
	 *
	 * @pre aCommonName != null AND aGenus != null AND aSpecies != null AND aLegCount >= 0
	 *
	 * @post commonName = aCommonName AND genus = aGenus AND species = aSpecies AND legCount = aLegCount
     */
    public Mammal(String aCommonName, String aGenus, String aSpecies, int aLegCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        legCount = aLegCount;
    }

    public String getGenus()
    {
        return genus;
    }

    public String getSpecies()
    {
        return species;
    }

    public String getCommonName()
    {
        return commonName;
    }

    public int getLegCount()
    {
        return legCount;
    }
}
