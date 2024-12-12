public static OkHttpClient getSecureHttpClient() {
    return new OkHttpClient.Builder()
        .addInterceptor(chain -> {
            HttpUrl url = chain.request().url();
            // Block requests to localhost
            if ("127.0.0.1".equals(url.host()) || "localhost".equals(url.host())) {
                throw new IOException("Blocked localhost traffic");
            }
            return chain.proceed(chain.request());
        })
        .build();
}
