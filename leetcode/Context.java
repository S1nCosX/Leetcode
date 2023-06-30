package leetcode;

public class Context {
    private final Object[] context;

    public Context(Object... context){
        this.context = context;
    }
    public Object[] getContext(){
        return context;
    }
}
