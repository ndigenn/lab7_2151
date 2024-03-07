
/**
 *
 * @invariant finCount > 0
 *
 * @corresponds common_name = commonName AND genus_name = genus AND species_name = species AND fin_count = finCount
 *
 */
public class Fish implements IFish {

    private String commonName;
    private String genus;
    private String species;
    private int finCount;

    /**
	 * Constructs a Fish that sets the commonName, genus, species, and fin count
	 *
	 * @param aCommonName - the common name of the fish, a String
	 * @param aGenus -  the genus of the fish, a String
     * @param aSpecies -  the species of the fish , a String
     * @param aFinCount -  the leg count of a fish, an int
     * @param aFinCount -  the leg count of an fish, an int
	 *
	 * @pre aCommonName != null AND aGenus != null AND aSpecies != null AND aLegCount >= 0
	 *
	 * @post commonName = aCommonName AND genus = aGenus AND species = aSpecies AND finCount = aFinCount
     */
    public Fish(String aCommonName, String aGenus, String aSpecies, int aFinCount)
    {
        commonName = aCommonName;
        genus = aGenus;
        species = aSpecies;
        finCount = aFinCount;
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

    public int getFinCount()
    {
        return finCount;
    }
}
