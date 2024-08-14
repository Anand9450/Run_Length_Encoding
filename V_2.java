package com.anand;

class RunLengthEncoding {
    public String encoding(String toEncode) {
        int consecutiveCharCount = 1;
        StringBuilder encodedString = new StringBuilder();
        for (int currentChar = 1; currentChar < toEncode.length(); ++currentChar) {
            if (toEncode.charAt(currentChar) != toEncode.charAt(currentChar - 1)) {
                encodedString.append(consecutiveCharCount);
                encodedString.append(toEncode.charAt(currentChar - 1));
                consecutiveCharCount = 1;
            } else {
                ++consecutiveCharCount;
            }
        }
        // Append the last group of characters
        encodedString.append(consecutiveCharCount);
        encodedString.append(toEncode.charAt(toEncode.length() - 1));

        return encodedString.toString();
    }

    public static void main(String[] args) {
        RunLengthEncoding runLengthEncoding = new RunLengthEncoding();

        String testcase1 = "AAAAABBBCDDDDD";
        System.out.println("RLE of " + testcase1 + ": " + runLengthEncoding.encoding(testcase1));
        String testcase2 = "AAAAAANNNNNNNDDDDD";
        System.out.println("RLE of " + testcase2 + ": " + runLengthEncoding.encoding(testcase2));
    }
}
