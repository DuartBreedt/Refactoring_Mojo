package za.co.entelect.mojo.old.refactoring.d.problem;

public class ColourUtility {

    public static int[] hexToRgb(String hex) {
        int red = Integer.parseInt(hex.substring(0, 2), 16);
        int green = Integer.parseInt(hex.substring(2, 4), 16);
        int blue = Integer.parseInt(hex.substring(4), 16);

        return new int[]{red, green, blue};
    }
}
