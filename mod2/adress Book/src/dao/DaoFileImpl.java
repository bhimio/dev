package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exceptions.PersistenceException;
import interfaces.Dao;
import modle.Adress;

public class DaoFileImpl implements Dao {
	private Map<String, Adress> adressMap = new HashMap<>();
	public static final String ADRESS_FILE = "book.txt";
	public static final String DELIMITER = "::";

	public DaoFileImpl() {

	}

	@Override
	public Adress createAdress(Adress myAdress) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress deleteAdress(Adress myAdress) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adress getAdress(String name) throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adress> getAllAdresses() throws PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() throws PersistenceException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws PersistenceException {
		// TODO Auto-generated method stub

	}

	@Override
	public int count() {
		return adressMap.size();
	}

	/**
	 * reads all Adresss from file
	 * preferably at startup
	 * 
	 * @throws PersistenceException if an error occurs wile reading the
	 *                              file
	 */
	private void loadRoster() throws PersistenceException {
		Scanner scanner;

		try {
			// Create Scanner for reading the file
			scanner = new Scanner(
					new BufferedReader(
							new FileReader(ADRESS_FILE)));
		} catch (FileNotFoundException e) {
			throw new PersistenceException(
					"-_- Could not load roster data into memory.", e);
		}
		// currentLine holds the most recent line read from the file
		String currentLine;
		// currentTokens holds each of the parts of the currentLine after it has
		// been split on our DELIMITER
		// NOTE FOR APPRENTICES: In our case we use :: as our delimiter. If
		// currentLine looks like this:
		// 1234::Joe::Smith::Java-September2013
		// then currentTokens will be a string array that looks like this:
		//
		// ___________________________________
		// | | | | |
		// |1234|Joe|Smith|Java-September2013|
		// | | | | |
		// -----------------------------------
		// [0] [1] [2] [3]
		String[] currentTokens;
		// Go through ROSTER_FILE line by line, decoding each line into a
		// Adress object.
		// Process while we have more lines in the file
		while (scanner.hasNextLine()) {
			// get the next line in the file
			currentLine = scanner.nextLine();
			// break up the line into tokens
			currentTokens = currentLine.split(DELIMITER);
			// Create a new Adress object and put it into the map of Adress
			// NOTE FOR APPRENTICES: We are going to use the Adress id
			// which is currentTokens[0] as the map key for our Adress object.
			// We also have to pass the Adress id into the Adress constructor
			Adress currentAdress = new Adress(currentTokens[0]);
			// Set the remaining vlaues on currentAdress manually
			currentAdress.setFirstName(currentTokens[1]);
			currentAdress.setLastName(currentTokens[2]);
			// Put currentAdress into the map using AdressID as the key
			adressMap.put(currentAdress.getFirstName(), currentAdress);
		}
		// close scanner
		scanner.close();
	}

	/**
	 * Writes all Adresss in the roster out to a ROSTER_FILE. See loadRoster
	 * for file format.
	 * 
	 * @throws PersistenceException if an error occurs writing to the
	 *                              file
	 */
	private void writeRoster() throws PersistenceException {
		// NOTE FOR APPRENTICES: We are not handling the IOException - but
		// we are translating it to an application specific exception and
		// then simple throwing it (i.e. 'reporting' it) to the code that
		// called us. It is the responsibility of the calling code to
		// handle any errors that occur.
		PrintWriter out;

		try {
			out = new PrintWriter(new FileWriter(ADRESS_FILE));
		} catch (IOException e) {
			throw new PersistenceException(
					"Could not save Adress data.", e);
		}

		// Write out the Adress objects to the roster file.
		// NOTE TO THE APPRENTICES: We could just grab the Adress map,
		// get the Collection of Adresss and iterate over them but we've
		// already created a method that gets a List of Adresss so
		// we'll reuse it.
		List<Adress> AdressList = this.getAllAdresses();
		for (Adress currentAdress : AdressList) {
			// write the Adress object to the file
			out.println(currentAdress.getAdressName() + DELIMITER
					+ currentAdress.getFirstName() + DELIMITER
					+ currentAdress.getLastName());
			// force PrintWriter to write line to the file
			out.flush();
		}
		// Clean up
		out.close();
	}

}
