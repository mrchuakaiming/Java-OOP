public class Bird extends Animal {
    public Bird(String name){
        super(name);
    }

    public void eat(){
        System.out.println(this.name + " is eating while flying");
    }
}
