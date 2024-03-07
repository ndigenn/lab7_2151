/**
 * @defines
 *
 * @constraints
 *
 * @initialization_ensures
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
