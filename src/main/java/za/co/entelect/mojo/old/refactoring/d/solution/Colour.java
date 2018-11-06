package za.co.entelect.mojo.old.refactoring.d.solution;

class Colour {
    private ColourNames name;
    private int hexValue;

    Colour(ColourNames name, int hexValue) {
        this.name = name;
        this.hexValue = hexValue;
    }

    ColourNames getName() {
        return name;
    }

    int[] getRgb() {
        String hexStringValue = Integer.toHexString(hexValue);
        int red = Integer.parseInt(hexStringValue.substring(0, 2), 16);
        int green = Integer.parseInt(hexStringValue.substring(2, 4), 16);
        int blue = Integer.parseInt(hexStringValue.substring(4), 16);

        return new int [] {red, green, blue};
    }
}
