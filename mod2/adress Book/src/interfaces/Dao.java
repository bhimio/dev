package interfaces;

import java.util.List;

import exceptions.PersistenceException;
import modle.Adress;

public interface Dao {
    /**
     * creates an adress
     * 
     * @param myAdress
     * @return created adress
     * @throws PersistenceException
     */
    Adress createAdress(Adress myAdress) throws PersistenceException;

    /**
     * deletes an adress
     * 
     * @param myAdress
     * @return deleted adress
     * @throws PersistenceException
     */
    Adress deleteAdress(Adress myAdress) throws PersistenceException;

    /**
     * gets an adress by searching by name
     * 
     * @param name
     * @return searched adress
     * @throws PersistenceException
     */
    Adress getAdress(String name) throws PersistenceException;

    /**
     * gets all the adresses
     * 
     * @return all the adresses
     * @throws PersistenceException
     */
    List<Adress> getAllAdresses() throws PersistenceException;

    /**
     * instantiates all adresses to run the program and also makes the file if it
     * does not exist
     * 
     * @throws PersistenceException
     */
    void run() throws PersistenceException;

    /**
     * puts all the adresses into long term memory so you can close the program
     * 
     * @throws PersistenceException
     */
    void close() throws PersistenceException;

    /**
     * counts all the adresses
     * 
     * @return the number of adresses
     * @throws PersistenceException
     */
    int count() throws PersistenceException;
}
