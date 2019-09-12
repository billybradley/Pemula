package home.enigma.model;

public class Circle {
    public Integer r;
    private final Double pii = 3.14;

    public Double getSurface() {
        return pii*r*r;
    }
    public Double getRound(){
        return pii*r*2;
    }
    public Double getHalfRound(){
        return getRound()/2;
    }
    public Double getHalfSurface(){
        return getSurface()/2;
    }
    public String print(){
        return "Circle{"+"r= "+r+",pii ="+pii+",Surface ="+getSurface()+", round ="+getRound()+"}";

    }

}
