package laba4.story.Actions;
public class Hear extends Actions {
    public String citizensHear() {
        return "услышали";
    }

    @Override
    public String toString() {
        return "услышать";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
