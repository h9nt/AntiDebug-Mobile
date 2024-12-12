private boolean isBeingTraced() {
    try {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream("/proc/self/status"))
        );
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("TracerPid:")) {
                String tracerPid = line.split("\\s+")[1];
                return !tracerPid.equals("0");
            }
        }
        reader.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
}
