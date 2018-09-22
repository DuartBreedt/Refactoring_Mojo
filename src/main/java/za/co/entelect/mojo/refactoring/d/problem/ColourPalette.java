package za.co.entelect.mojo.refactoring.d.problem;

import java.util.HashMap;
import java.util.Map;

class ColourPalette {
    private Map<String, String> hexColours;

    ColourPalette() {
        this.hexColours = new HashMap<>();
    }

    void addColour(String name, String hex) {
        hexColours.put(name, hex);
    }

    String getColour(String colourName) {
        return hexColours.get(colourName);
    }
}
