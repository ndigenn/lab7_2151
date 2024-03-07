/**
 *@defines common_name: "the common name of the fish" AND genus_name: "the genus of the fish" AND species_name: "the
 * species of the fish" AND fin_count: "the number of fins the fish has"
 *
 * @constraints fin_num >= 0
 *
 * @initialization_ensures The common_name, genus_name, species_name, and fin_count are all set AND fin_count >= 0
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
