package za.co.entelect.mojo.refactoring.d.solution;

import java.util.Arrays;

public class Main {

    public static void main(String... args) {
        ColourPalette colourPalette = new ColourPalette();

        colourPalette.addColour(ColourNames.RED, 0xFF0000);
        colourPalette.addColour(ColourNames.GREEN, 0x00FF00);
        colourPalette.addColour(ColourNames.BLUE, 0x0000FF);

        Colour red = colourPalette.getColour(ColourNames.RED);
        int[] redRGB = red.getRgb();

        System.out.println(Arrays.toString(redRGB));
    }
}
