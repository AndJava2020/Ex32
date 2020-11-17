import java.io.Serializable;

public class Object implements Serializable {
        private int n;
        private String name;
        Object(String name,int n){
            this.name=name;
            this.n=n;
        }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Object{" +
                "n=" + n +
                ", name='" + name + '\'' +
                '}';
    }
}
