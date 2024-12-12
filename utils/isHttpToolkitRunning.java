private boolean isHttpToolkitRunning() {
    try {
        Socket socket = new Socket("127.0.0.1", 8000); // HTTP Toolkit uses port 8000
        socket.close();
        return true;
    } catch (IOException ignored) {
        return false;
    }
}
