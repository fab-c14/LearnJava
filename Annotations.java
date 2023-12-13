class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

@Deprecated
class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

public class Annotations {
    public static void main(String[] args) {
        // annotations - suppliment to compiler or runtime, sometime you want to
        // interact with compiler, sometime we want to send additional data to compiler
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        // there are lot of annotations in java, one is @Override
        // annotations - works on different levels, on class, on method, on variable
    }
}
