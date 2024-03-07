/**
 *
 *
 * @defines
 *
 * @constraints
 *
 * @initialization_ensures
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
