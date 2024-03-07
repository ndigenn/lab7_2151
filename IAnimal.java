/**
 * @defines common_name: Z AND genus_name: Z AND species_name: Z AND leg_count = Z
 *
 * @constraints None
 *
 * @initialization_ensures The common_name, genus_name, species_name, and leg_count are all set
 */
public interface IAnimal
{
    /**
     * Standard getter for the common name of the animal
	 *
     * @return The common name as a String
     * @pre None
     * @post getCommonName = commonName AND genus = #genus AND species = #species AND legCount = #legCount
     */
    public String getCommonName();

    /**
     * Standard getter for the genus of the animal
	 *
     * @return The genus name as a String
     * @pre None
     * @post getGenus = genus AND commonName = #commonName AND species = #species AND legCount = #legCount
     */
    public String getGenus();

    /**
     * Standard getter for the species of the animal
	 *
     * @return The species name as a String
     * @pre None
     * @post getSpecies = species AND genus = #genus AND commonName = #commonName AND legCount = #legCount
     */
    public String getSpecies();

    /**
     * Gets the description of an animal
	 * @return The correctly formmated description of the animal
	 * @pre None
	 * @post getDescription = [COMMONNAME (GENUSNAME+""+speciesname)]
     */
    public default String getDescription(){
        String properGenusFormatting = getGenus().substring(0,1).toUpperCase() + getGenus().substring(1).toLowerCase();
        return getCommonName() + " (" + properGenusFormatting + " " + getSpecies().toLowerCase() + ")";
    }
}
