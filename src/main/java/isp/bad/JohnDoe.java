package isp.bad;

public class JohnDoe implements Athlete {

    @Override
    public void compete() {
        System.out.println("John Doe started competing");
    }

    @Override
    public void swim() {
        System.out.println("John Doe started swimming");
    }

    @Override
    public void highJump() {
    }

    @Override
    public void longJump() {
    }
}
