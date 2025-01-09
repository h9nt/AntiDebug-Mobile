private boolean isSignatureValid(Context context) {
    try {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(
            context.getPackageName(),
            PackageManager.GET_SIGNING_CERTIFICATES
        );

        String expectedSignature = "YOUR_EXPECTED_SIGNATURE_HASH";
        String currentSignature = Base64.encodeToString(
            packageInfo.signingInfo.getApkContentsSigners()[0].toByteArray(),
            Base64.DEFAULT
        );

        return expectedSignature.equals(currentSignature);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
