private boolean isDeviceRooted() {
    String[] paths = {
        "/system/bin/su",
        "/system/xbin/su",
        "/system/app/Superuser.apk",
        "/system/app/MagiskManager.apk"
    };
    for (String path : paths) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
    }
    return false;
}
