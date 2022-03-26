package neu.jia.info5100MidTerm.question05;

public class Camera {

    private static Camera _instance;
    private static Object obj = new Object();
    private String cameraName = "";

    private Camera() {

    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }


    public static Camera getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }
}
