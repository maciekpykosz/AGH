package canban.model;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private taskPriority priority;
    private String expDate;
    private String description;

    public String getTitle() {
        return title;
    }

    public taskPriority getPriority() {
        return priority;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getDescription() {
        return description;
    }

    public Task(String title, taskPriority priority, String expDate, String description) {
        this.title = title;
        this.priority = priority;
        this.expDate = expDate;
        this.description = description;
    }

    public Task(){
        this.title=" ";
        this.priority=null;
        this.description="";
        this.expDate=" ";
    }

    public Task(Task e){
        this.title = e.getTitle();
        this.priority = e.getPriority();
        this.description = e.getDescription();
        this.expDate = e.getExpDate();
    }

    @Override
    public String toString() {
        return title;
    }

    public Paint getTaskColor() {
        if(getPriority() == taskPriority.LOW){
            return Color.ROSYBROWN;
        }
        else if(getPriority() == taskPriority.NORMAL){
            return Color.GREEN;
        }
        else {
            return Color.RED;
        }
    }
}


