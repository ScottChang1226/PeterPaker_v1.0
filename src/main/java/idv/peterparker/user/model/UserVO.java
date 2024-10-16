package idv.peterparker.user.model;

import java.io.Serializable;

public class UserVO implements Serializable{
//	  @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column (name="user_id")
//    @SerializedName("user_id")
    private Integer userId;

//    @SerializedName("user_name")
//    @Column (name="user_name")
    private String userName;

//    @SerializedName("user_phone")
//    @Column (name="user_phone")
    private String userPhone;

//    @SerializedName("user_account")
//    @Column (name="user_account")
    private String userAccount;

//    @SerializedName("user_password")
//    @Column (name="user_password")
    private String userPassword;

//    @SerializedName("car_number")
//    @Column (name="car_number")
    private String carNumber;

//    @Column (name="google_token")
    private String googleToken;

    public UserVO() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getGoogleToken() {
        return googleToken;
    }

    public void setGoogleToken(String googleToken) {
        this.googleToken = googleToken;
    }

    public UserVO(String userName, String userPhone, String userAccount, String userPassword, String carNumber) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.carNumber = carNumber;
    }

    public UserVO(Integer userId, String userName, String userPhone, String userAccount, String userPassword, String carNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.carNumber = carNumber;
    }

}
