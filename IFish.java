/**
 *
 *
 * @defines common_name: Z AND genus_name: Z AND species_name: Z AND fin_count: Z
 *
 * @constraints fin_num >= 0
 *
 * @initialization_ensures The common_name, genus_name, species_name, and fin_num are all set AND fin_count >= 0
 */
public interface IFish extends IAnimal
{
    /**
     * Standard getter for the fin count of an animal
	 *
	 * @return the fin count as an int
	 * @pre None
	 * @post getFinCount = finCount AND commonName = #commonName AND genus = #genus AND species = #species
     */
    public int getFinCount();
}
