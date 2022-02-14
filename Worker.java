//package knhel7.jd14.javacore14.task112;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }
    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }
    public Worker(OnTaskDoneListener callback,
                  OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) errorCallback.onError("Task " + i + " isn't done!");
            else callback.onDone("Task " + i + " is done");
        }
    }

}
