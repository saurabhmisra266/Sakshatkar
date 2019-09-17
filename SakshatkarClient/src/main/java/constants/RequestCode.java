package constants;

public enum RequestCode {

    LOGIN_REQUEST,
    SIGNUP_REQUEST,
    USERSEARCH_REQUEST,
    ONLINEUSER_REQUEST,
    FRIENDSUGGESTION_REQUEST,
    PROFILEPHOTO_REQUEST,
    FRIENDLIST_REQUEST,
    LOGOUT_REQUEST,
    ADDFRIEND_REQUEST,
    STATUS_CHANGE_REQUEST,
    GETSTATUS_REQUEST,
    USERIP_REQUEST,
    FEEDBACK_REQUEST,
    VIDEO_CALL_REQUEST,
    FILETRANSFER_REQUEST;
    RequestCode(){
        this.toString();
    }
}