private boolean isFridaServerRunning() {
    try {
        Socket socket = new Socket("127.0.0.1", 27042);
        socket.close();
        return true;
    } catch (IOException e) {
        return false;
    }
}
