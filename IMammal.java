/**
 * @defines common_name: Z AND genus_name: Z AND species_name: Z AND leg_count = Z
 *
 * @constraints leg_count >= 0
 *
 * @initialization_ensures The common_name, genus_name, species_name, and leg_count are all set AND leg_count >= 0
 */
public interface IMammal extends IAnimal
{
    /**
     * Standard getter for the leg count of an animal
	 *
	 * @return the leg count as an int
	 * @pre None
	 * @post getLegCount = legCount AND commonName = #commonName AND genus = #genus AND species = #species
     */
    public int getLegCount();
}
