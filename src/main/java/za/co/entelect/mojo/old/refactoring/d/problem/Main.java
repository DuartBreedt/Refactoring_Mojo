package za.co.entelect.mojo.old.refactoring.d.problem;

import java.util.Arrays;

import static za.co.entelect.mojo.old.refactoring.d.problem.ColourUtility.hexToRgb;

public class Main {

    public static void main(String... args) {
        ColourPalette colourPalette = new ColourPalette();

        colourPalette.addColour("red", "FF0000");
        colourPalette.addColour("green", "00FF00");
        colourPalette.addColour("blue", "0000FF");

        String red = colourPalette.getColour("red");
        int[] redRGB = hexToRgb(red);

        System.out.println(Arrays.toString(redRGB));
    }
}
