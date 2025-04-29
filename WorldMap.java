public class WorldMap {
    public static void main(String[] args) {
        // Read width and height
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        
        // Set canvas size and scale
        StdDraw.setCanvasSize(width, height);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        // Read regions until end of input
        while (!StdIn.isEmpty()) {
            String region = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] x = new double[vertices];
            double[] y = new double[vertices];
            
            for (int i = 0; i < vertices; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            
            StdDraw.polygon(x, y);
        }
    }
}