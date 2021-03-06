package drawing.entity.shape;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import drawing.entity.lines.LineList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.canvas.GraphicsContext;
/**
 * All rights Reserved, Designed by Popping Lim
 *
 * @Author: Popping Lim
 * @Date: 2018/9/22
 * @Todo: Shape，包装有自己的名字字段
 */
public abstract class Shape extends RecursiveTreeObject<Shape> {

    private StringProperty shapeType = new SimpleStringProperty();

    private LineList lineList;

    public Shape(ShapeType shapeType, LineList lineList) {
        this.shapeType.set(shapeType.getType());
        this.lineList = lineList;
    }

    public StringProperty getShapeType() {
        return shapeType;
    }

    public void draw(GraphicsContext gc) {
        if(lineList!=null) {
            lineList.draw(gc);
        }
    }

    public LineList getLineList() {
        return lineList;
    }

    /**
     * @Description: 绘制模拟效果
     * @author Popping Lim
     * @date 2018/9/26
     */
    public abstract void drawSimulation(GraphicsContext gc);

}
