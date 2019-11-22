package dip.bad;

public class Project {

    private BackendDeveloper backEndDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontEndDeveloper = new FrontendDeveloper();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }

}
