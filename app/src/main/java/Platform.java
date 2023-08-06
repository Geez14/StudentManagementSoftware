public class Platform {
    static final String os = System.getProperty("os.name");

    public static final boolean isWindows = os.startsWith("Windows");
    public static final boolean isLinux = os.startsWith("Linux");
}
