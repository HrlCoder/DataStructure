package ArrayList.int_Type;

// 仿写真实的 (java.util.Iterator) 接口
// 迭代(Iterate)器(or)
public interface Iterator {
    boolean hasNext();

    Integer next();

    void remove();
}
