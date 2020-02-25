package sample;

import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import static sample.Equation.calc;

public class DrawerTask extends Task {
    private GraphicsContext gc;
    private int amountOfPoints;

    public DrawerTask(GraphicsContext gc, int amountOfPoints){
        this.gc = gc;
        this.amountOfPoints = amountOfPoints;
    }

    @Override
    protected Object call(){
        Random random = new Random();
        double x;
        double y;
        double result = 0;

        BufferedImage bi = new BufferedImage((int) gc.getCanvas().getWidth(), (int) gc.getCanvas().getHeight(), BufferedImage.TYPE_INT_RGB);
        double MIN = -8;
        double MAX = 8;
        for(int i = 0; i < amountOfPoints; i++){
            x = MIN + (MAX - MIN) * random.nextDouble();
            y = MIN + (MAX - MIN) * random.nextDouble();
            if(calc(x,y)){
                double x1 = gc.getCanvas().getWidth() * (x- MIN) / (MAX - MIN);
                double y1=  gc.getCanvas().getHeight() * (y- MIN) / (MAX - MIN);
                bi.setRGB((int)x1, (int)(-y1 + gc.getCanvas().getHeight()), Color.YELLOW.getRGB());
                result++;
            }
            else{
                double x1 = gc.getCanvas().getWidth() * (x- MIN) / (MAX - MIN);
                double y1=  gc.getCanvas().getHeight() * (y- MIN) / (MAX - MIN);
                bi.setRGB((int)x1, (int)(-y1 + gc.getCanvas().getHeight()), Color.BLUE.getRGB());
            }
            if(i % 1000 == 0){
                gc.drawImage(SwingFXUtils.toFXImage(bi, null), 0, 0);
            }

            updateProgress(i, amountOfPoints);
            if(isCancelled()) {
                break;
            }
        }
        gc.drawImage(SwingFXUtils.toFXImage(bi,null), 0, 0);
        result = result * (MAX - MIN) * (MAX - MIN) / amountOfPoints;
        return result;
    }
}
