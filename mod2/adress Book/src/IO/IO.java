package IO;

import java.util.Scanner;

import interfaces.consoleIO;

public class IO implements consoleIO {
    private Scanner sc = new Scanner(System.in);

    @Override
    public int readInt(String prompt) {
        boolean isCorrect = false;
        int value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.readString(prompt);
            try {
                value = Integer.parseInt(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("that was not a number please try again");
            }
        }
        return value;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        boolean isCorrect = false;
        int value;
        do {
            value = this.readInt(prompt);
            if (value > max) {
                this.print("that number was to high");
            } else if (value < min) {
                this.print("that number was to low");
            } else {
                isCorrect = true;
            }
        } while (!isCorrect);
        return value;
    }

    @Override
    public float readFloat(String prompt) {
        boolean isCorrect = false;
        float value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.readString(prompt);
            try {
                value = Float.parseFloat(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("that was not a number please try again");
            }
        }
        return value;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        boolean isCorrect = false;
        float value;
        do {
            value = this.readFloat(prompt);
            if (value > max) {
                this.print("that number was to high");
            } else if (value < min) {
                this.print("that number was to low");
            } else {
                isCorrect = true;
            }
        } while (!isCorrect);
        return value;
    }

    @Override
    public double readDouble(String prompt) {
        boolean isCorrect = false;
        double value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.readString(prompt);
            try {
                value = Double.parseDouble(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("That was not a double. Please try again");
            }
        }
        return value;
    }

    @Override
    public double readDouble(String prompt, Double min, Double max) {
        boolean isCorrect = false;
        double value;
        do {
            value = this.readDouble(prompt);
            if (value > max) {
                this.print("that number was to high");
            } else if (value < min) {
                this.print("that number was to low");
            } else {
                isCorrect = true;
            }
        } while (!isCorrect);
        return value;
    }

    @Override
    public boolean readboolean(String prompt) {
        boolean isCorrect = false;
        boolean value = false;
        String userInput;
        while (!isCorrect) {
            userInput = this.readString(prompt);
            try {
                value = Boolean.parseBoolean(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("That was not a boolean. Please try again");
            }
        }
        return value;
    }

    @Override
    public long readLong(String prompt) {
        boolean isCorrect = false;
        String userInput;
        long value = 0;
        while (!isCorrect) {
            userInput = this.readString(prompt);
            try {
                value = Long.parseLong(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("That was not a double. Please try again");
            }
        }
        return value;
    }

    public long readLong(String prompt, long min, long max) {
        boolean isCorrect = false;
        long value;
        do {
            value = this.readLong(prompt);
            if (value > max) {
                this.print("that number was to high");
            } else if (value < min) {
                this.print("that number was to low");
            } else {
                isCorrect = true;
            }
        } while (!isCorrect);
        return value;
    }

    @Override
    public String readString(String prompt) {
        this.print(prompt);
        return this.sc.nextLine();
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);

    }
}
