package neu.jia.info5100MidTerm.question05;

public class Main {

    public static void main(String[] args) {

        Camera camera1 = Camera.getInstance();
        camera1.setCameraName("Camera1");
        Camera camera2 = Camera.getInstance();

        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());

        camera2.setCameraName("Camera2");
        System.out.println(camera1.getCameraName());
        System.out.println(camera2.getCameraName());
    }
}
