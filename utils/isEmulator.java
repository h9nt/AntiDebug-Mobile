private boolean isEmulator() {
    String fingerprint = Build.FINGERPRINT;
    return fingerprint.contains("generic") || fingerprint.contains("sdk");
}
