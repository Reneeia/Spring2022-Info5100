package neu.jia.info5100MidTerm.question05;

public class Camera {


    private static Camera _instance;
    private static Object obj;
    private String cameraName = "";

    //constructor without parameter
    private Camera() {

    }

    //getter
    public String getCameraName() {
        return cameraName;
    }

    //setter
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    //public getInstance method can only create one Camera instance
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
