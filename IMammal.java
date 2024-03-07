/**
 * @defines common_name: "The common name of the mammal" AND genus_name: "The genus of the mammal
 * AND species_name: "the species of the mammal" AND leg_count = "The number of legs the mammal has"
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
