private boolean isLocalhostProxyActive() {
    int[] commonPorts = {8080, 8888, 9090, 8000}; // Common proxy ports
    for (int port : commonPorts) {
        try {
            Socket socket = new Socket("127.0.0.1", port);
            socket.close();
            return true; // Traffic is redirected to localhost
        } catch (IOException ignored) {
        }
    }
    return false;
}
