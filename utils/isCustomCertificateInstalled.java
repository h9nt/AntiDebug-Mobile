private boolean isCustomCertificateInstalled() {
    try {
        KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
        keyStore.load(null);

        Enumeration<String> aliases = keyStore.aliases();
        while (aliases.hasMoreElements()) {
            String alias = aliases.nextElement();
            X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);

            if (cert.getIssuerDN().getName().contains("Burp") || cert.getIssuerDN().getName().contains("HTTP Toolkit")) {
                return true;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
