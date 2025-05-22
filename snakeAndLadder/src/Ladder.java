public class Ladder extends Jump{
    public Ladder(int start, int end){
        super(start,end);
        if(start>=end){
            throw new IllegalArgumentException("Ladder cannot be downwards");
        }
    }
    @Override
    public String toString() {
        return "Ladder from " + getStart() + " to " + getEnd();
    }
}
