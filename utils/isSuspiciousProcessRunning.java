private boolean isSuspiciousProcessRunning() {
    try {
        Process process = Runtime.getRuntime().exec("ps");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("frida") || line.contains("gadget")) {
                return true; // Suspicious process detected
            }
        }
        reader.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
