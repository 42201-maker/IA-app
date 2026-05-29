package enums;

public enum FurColor {
    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE_TABBY(3, "Orange Tabby"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    CALICO(6, "Calico"),
    SPOTTED(7, "Spotted");

    private final int code;
    private final String displayName;

    FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static FurColor fromCode(int code) {
        for (FurColor f : values()) {
            if (f.code == code) return f;
        }
        throw new IllegalArgumentException("Invalid FurColor: " + code);
    }
}
