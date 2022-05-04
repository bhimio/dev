package interfaces;

public interface ConsoleIo {
    public void print(String msg);

    public int readInt(String prompt);

    public int readInt(String prompt, int min, int max);

    public float readFloat(String prompt);

    public float readFloat(String prompt, float min, float max);

    public double readDouble(String prompt);

    public double readDouble(String prompt, Double min, Double max);

    public boolean readboolean(String prompt);

    public String readString(String prompt);

    public long readLong(String prompt);

    public long readLong(String prompt, long min, long max);

}
