public class DocNum {
    public static void getNum(String docNum) {
        String[] parts = docNum.split("-");
        System.out.print(parts[0] + " " + parts[2]);
    }

    public static void getDocNum(String docNum) {
        String[] parts = docNum.split("-");
        parts[1] = "***";
        parts[3] = "***";
        docNum = String.join("-", parts);
        System.out.println(docNum);
    }

    public static void getLowerLetters(String docNum) {
        String[] parts = docNum.split("-");
        char[] elements = parts[4].toCharArray();
        elements[0] = '/';
        elements[2] = '/';
        parts[4] = String.valueOf(elements);
        String newString = String.join("/", parts[1], parts[3]);
        System.out.println("letters: " + newString.toLowerCase() + parts[4].toLowerCase());
    }

    public static void getUpperLetters(String docNum) {
        StringBuilder doc = new StringBuilder(docNum);
        doc.delete(0, 5);
        doc.delete(3, 8);
        doc.replace(3,4, "/");
        doc.delete(7, 8);
        doc.replace(7, 8, "/");
        doc.replace(9, 10, "/");
        String newString = doc.toString();
        System.out.println("LETTERS: " + newString.toUpperCase());
    }

    public static void checkContainString(String docNum) {
        if (docNum.contains("abc") || docNum.contains("ABC")) {
            System.out.println("The document number contains 'abc' or 'ABC'");
        } else {
            System.out.println("The document number doesn't contain 'abc' or 'ABC'");
        }
    }

    public static void checkSequenceNum(String docNum) {
        if (docNum.startsWith("555")) {
            System.out.println("The document number starts with '555'");
        } else {
            System.out.println("The document number doesn't start with '555'");
        }
    }

    public static void checkSequenceEnd(String docNum) {
        if (docNum.endsWith("1a2b")) {
            System.out.println("The document number contains '1a2b' at the end");
        } else {
            System.out.println("The document number doesn't contain '1a2b' at the end");
        }
    }
}
