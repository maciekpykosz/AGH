package matrix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Matrix <T> implements Iterable<Integer>{
    private List<List<T>> matrix = new ArrayList<>();
    private T type;

    public Matrix(T type) {
        this.type = type;
    }

    public void fillTheMatrix(){
        for (int i = 0; i < 3; i++){
            List<T> line = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                line.add(type);
            }
            matrix.add(line);
        }
    }

    public void showTheMatrix(){
        Iterator<List<T>> iterator = matrix.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

   /* public void matrixAddition(Matrix matrix1, Matrix matrix2){
        List<List<T>> summaryMatrix = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                summaryMatrix.add(matrix1.get(j));
            }

    }
*/
     @Override
    public Iterator<Integer> iterator() {
        return null;
    }



}
