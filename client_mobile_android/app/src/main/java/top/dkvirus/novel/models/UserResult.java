package top.dkvirus.novel.models;

public class UserResult extends CommonResult {

    private User data = new User();

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
