package madem.java.dev;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int PIECE_SIZE = 4;

    public static void main(String[] args) {
        buildCrown();
        buildDisk();
        buildShaft();
        buildBase();
    }

    public static void buildCrown() {
        buildCommonNeedle();
        buildCommon();
    }

    public static void buildShaft() {
        buildCommonNeedle();
        buildMidSection();
    }

    public static void buildBase() {
        buildCommon();
    }

    public static void buildMidSection() {
        //this prints the top 4 and neck of needle
        for(int i = 0; i < PIECE_SIZE * PIECE_SIZE; i++) {
            for(int j = 0; j < 3 * PIECE_SIZE - 3; j++) {
                System.out.print(" ");
            }

            //print character
            System.out.print("|%%");
            System.out.print("||");
            System.out.print("%%|");
            System.out.println();
        }
    }

    public static void buildDisk() {
        System.out.println("");

    /*
      row-0 - spaces-0, 11 \/
      row-1 - spaces-2, 9 \/
      row-2 - spaces-4, 7 \/
      row-3 - spaces-6, 5 \/
    */

        for(int i = 0; i < PIECE_SIZE; i++) {
            for(int j =  0; j < i; j++) {
                System.out.print("  ");
            }

            System.out.print("\\_");

            for (int k = 0; k < (3 * PIECE_SIZE) - (2 * i) - 1; k++) {
                System.out.print("/\\");
            }

            System.out.print("_/\n");
        }
    }

    public static void buildCommon() {
        //this is repeated once on the top dome, other on the bottom as a bass.
        for(int i = 0; i < PIECE_SIZE; i++) {
            //spaces
      /*
        row-0 - spaces-9, colons:0
        row-1 - spaces-6, colons:3
        row-2 - spaces-3, colons:6
        row-3 - spaces-0, colons:9
      */

            for(int j =  0; j < ((3 * PIECE_SIZE) - 3 * (i + 1)); j++) {
                System.out.print(" ");
            }

            System.out.print("__/");

            //colon printing left
            for (int j = 0; j <  3 * i; j++) {
                System.out.print(":");
            }

            System.out.print("||");

            //colon printing left
            for (int j = 0; j <  3 * i; j++) {
                System.out.print(":");
            }

            System.out.println("\\__");
        }

        // build bottom of the base
        System.out.print("|");

        for (int k = 0; k < 2 * (3 * PIECE_SIZE); k++) {
            System.out.print("\"");
        }

        System.out.print("|");
    }

    public static void buildCommonNeedle() {
        //this prints the top 4 and neck of needle
        for(int i = 0; i < PIECE_SIZE; i++) {
            for(int j = 0; j < 3 * PIECE_SIZE; j++) {
                System.out.print(" ");
            }

            //print character
            System.out.print("||");
            System.out.println();
        }
    }
}