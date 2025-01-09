private boolean detectDebuggingPorts() {
    try {
        Socket socket = new Socket("127.0.0.1", 23946);
        socket.close();
        return true;
    } catch (IOException e) {
        return false;
    }
}
