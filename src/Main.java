public class Main {
    private static final int BUFFER_SIZE = 10;

    public static void main(String[] args) {
        BlockingQueueBuffer buffer = new BlockingQueueBuffer(BUFFER_SIZE);
        new MessageVisualization(buffer, BUFFER_SIZE);
    }
}
