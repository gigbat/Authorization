public interface Tasks {
    /**
     * As the first two characters, writes down the letters following
     * in the alphabet after the letter that is the first character of
     * the second word on the screen; if it is the letter "z", write "a".
     * @return two changed letter.
     */
    String test1();
    /**
     * Writes as the second character the letter that precedes the alphabet
     * letter that is the middle character of the second word on the screen; if it is the letter "a", write "z".
     * @return symbols from alphabet.
     */
    char test2();
    /**
     * If the third word contains an odd number of letters, then for the third
     * character write the letter following the letter in the alphabet, which
     * is the third character of the third word; if it is the letter "z", write "a".
     * If the third word contains an even number of characters, then for the third character
     * write the letter preceding the letter in the alphabet, which is the first
     * of the two middle characters of the third word; if it is the letter "a", write "z".
     * @return symbols from alphabet.
     */
    char test3();
    /**
     * The method is helped for test3_1();
     * @return symbols from alphabet.
     */
    char test3_1();
    /**
     * As the fourth character, he writes the letter of the alphabet in the place
     * corresponding to the sum of the number of characters in the first and second words minus 4 characters;
     * if this amount is more than 26, find and use the remainder of the specified
     * amount by 26 as the position number of the desired letter in the alphabet.
     * @return symbols from alphabet.
     */
    char test4();
    /**
     * Output for test task 1 - 5.
     */
    void printTask();
    /**
     * Output final result on the display.
     * @return string. Format - password.
     */
    String printGeneralTask();
    /**
     * Methods checks passwords.
     * @return true or false.
     * @param data string for check existing password and typed password in the console.
     */
    boolean checkPassword(String data);
}
