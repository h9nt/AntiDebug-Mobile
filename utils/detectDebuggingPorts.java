private boolean detectDebuggingPorts() {
    try {
        Socket socket = new Socket("127.0.0.1", 23946); // Example JDWP port
        socket.close();
        return true; // Debugging port detected
    } catch (IOException e) {
        return false; // No debugger port open
    }
}
