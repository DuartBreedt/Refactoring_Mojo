package za.co.entelect.mojo.refactoring.d.solution;

import java.util.ArrayList;
import java.util.List;

class ColourPalette {
    private List<Colour> hexColours;

    ColourPalette() {
        this.hexColours = new ArrayList<>();
    }

    void addColour(ColourNames name, int hex) {
        hexColours.add(new Colour(name, hex));
    }

    Colour getColour(ColourNames colourName) {
        for (Colour hexColour : hexColours) {
            if(hexColour.getName().equals(colourName)) {
                return hexColour;
            }
        }
        return null;
    }
}
