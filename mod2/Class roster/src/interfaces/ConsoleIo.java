package interfaces;

public interface ConsoleIo {
    public void print(String msg);
    public int getInt(String prompt);
    public int getInt(String prompt, int min, int max);
    public float getFloat(String prompt);
    public float getFloat(String prompt, float min, float max);
    public double getDouble(String prompt);
    public double getDouble(String prompt, Double min, Double max);
    public boolean getboolean(String prompt);
    public String getString(String prompt);
    public long getLong(String prompt);
    public long getLong(String prompt, long min, long max);

}
