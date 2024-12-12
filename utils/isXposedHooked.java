private boolean isXposedHooked() {
    for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
        if (element.getClassName().contains("de.robv.android.xposed")) {
            return true;
        }
    }
    return false;
}
