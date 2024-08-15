abstract class language {
    public void display() {
        System.out.println("Jva is a programming language");
    }

}

class Demo extends language {
    public static void main(String[] args) {
        language r = new Demo();
        Demo s = new Demo();
        r.display();
        s.display();
    }
}