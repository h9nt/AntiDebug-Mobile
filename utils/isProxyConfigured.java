private boolean isProxyConfigured(Context context) {
    String proxyHost = android.net.Proxy.getHost(context);
    int proxyPort = android.net.Proxy.getPort(context);

    return proxyHost != null && proxyPort != -1;
}
