public class Snake extends Jump {
    public Snake(int head,int tail)  {
        super(head,tail);
        if(head<=tail){
            throw new IllegalArgumentException("Snake tail should be below head");
        }
    }
    @Override
    public String toString() {
        return "Snake from " + getStart() + " to " + getEnd();
    }
}
