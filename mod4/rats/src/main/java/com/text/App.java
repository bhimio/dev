package com.text;

public class App {
    // When squirrels get together for a party, they like to have cigars.
    // A squirrel party is successful when the number of cigars is between
    // 40 and 60, inclusive. Unless it is the weekend, in which case there
    // is no upper bound on the number of cigars. Return true if the party
    // with the given values is successful, or false otherwise.
    //
    // greatParty(30, false) → false
    // greatParty(50, false) → true
    // greatParty(70, true) → true
    public boolean greatParty(int cigars, boolean isWeekend) {
        if (cigars > 40 && cigars < 60 && !isWeekend) {
            return true;
        } else if (cigars > 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    }
}