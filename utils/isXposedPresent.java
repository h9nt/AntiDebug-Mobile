private boolean isXposedPresent() {
    String[] paths = {
        "/system/framework/XposedBridge.jar",
        "/system/lib/libxposed_art.so",
        "/system/lib/libsubstrate.so",
        "/data/app/de.robv.android.xposed.installer"
    };
    for (String path : paths) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
    }
    return false;
}
