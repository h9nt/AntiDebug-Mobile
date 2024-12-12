public static OkHttpClient getPinnedHttpClient() {
    return new OkHttpClient.Builder()
        .certificatePinner(new CertificatePinner.Builder()
            .add("yourdomain.com", "sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=")
            .build()
        )
        .build();
}
