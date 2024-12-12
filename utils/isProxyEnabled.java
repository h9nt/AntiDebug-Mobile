private boolean isProxyEnabled() {
    try {
        String proxyHost = System.getProperty("http.proxyHost");
        String proxyPort = System.getProperty("http.proxyPort");

        return proxyHost != null && !proxyHost.isEmpty() && proxyPort != null && !proxyPort.isEmpty();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
