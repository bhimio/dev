package IO;

import java.util.Scanner;

import interfaces.ConsoleIo;

public class Console implements ConsoleIo {
    private Scanner sc = new Scanner(System.in);

    @Override
    public int getInt(String prompt) {
        boolean isCorrect = false;
        int value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.getString(prompt);
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
    public int getInt(String prompt, int min, int max) {
        boolean isCorrect = false;
        int value;
        do {
            value = this.getInt(prompt);
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
    public float getFloat(String prompt) {
        boolean isCorrect = false;
        float value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.getString(prompt);
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
    public float getFloat(String prompt, float min, float max) {
        boolean isCorrect = false;
        float value;
        do {
            value = this.getFloat(prompt);
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
    public double getDouble(String prompt) {
        boolean isCorrect = false;
        double value = 0;
        String userInput;
        while (!isCorrect) {
            userInput = this.getString(prompt);
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
    public double getDouble(String prompt, Double min, Double max) {
        boolean isCorrect = false;
        double value;
        do {
            value = this.getDouble(prompt);
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
    public boolean getboolean(String prompt) {
        boolean isCorrect = false;
        boolean value = false;
        String userInput;
        while (!isCorrect) {
            userInput = this.getString(prompt);
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
    public long getLong(String prompt) {
        boolean isCorrect = false;
        String userInput;
        long value = 0;
        while (!isCorrect) {
            userInput = this.getString(prompt);
            try {
                value = Long.parseLong(userInput);
                isCorrect = true;
            } catch (Exception e) {
                this.print("That was not a double. Please try again");
            }
        }
        return value;
    }


    public long getLong(String prompt, long min, long max) {
        boolean isCorrect = false;
        long value;
        do {
            value = this.getLong(prompt);
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
    public String getString(String prompt) {
        this.print(prompt);
        return this.sc.nextLine();
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);

    }
}
