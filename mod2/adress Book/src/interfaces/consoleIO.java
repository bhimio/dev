package interfaces;

public interface consoleIO {
    /**
     * prints msg
     * 
     * @param msg
     */
    public void print(String msg);

    /**
     * gets an string and converts it to a int unless the string is not a number
     * 
     * @param prompt
     * @return the int that has been created
     */
    public int readInt(String prompt);

    /**
     * uses .readInt and only between min and max
     * 
     * @param prompt
     * @param min
     * @param max
     * @return the int between min and max
     */
    public int readInt(String prompt, int min, int max);

    /**
     * 
     * 
     * @param prompt
     * @return
     */
    public float readFloat(String prompt);

    public float readFloat(String prompt, float min, float max);

    public double readDouble(String prompt);

    public double readDouble(String prompt, Double min, Double max);

    public boolean readboolean(String prompt);

    public String readString(String prompt);

    public long readLong(String prompt);

    public long readLong(String prompt, long min, long max);
}
