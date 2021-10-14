package my.edu.utar.hawker.model;

public class Hawker {
    private String address;
    private String description;
    private boolean displayPhoneNo;
    private boolean isOpen;
    private int favourites;
    private String name;
    private String phone;
    private int recommends;
    private String userReview;
    private String previousWeekOpeningHours;
    private String pictureName;

    public Hawker() {
    }

    public Hawker(String address, String description, boolean displayPhoneNo, boolean isOpen, int favourites, String name, String phone, int recommends, String userReview, String previousWeekOpeningHour, String pictureName) {
        this.address = address;
        this.description = description;
        this.displayPhoneNo = displayPhoneNo;
        this.isOpen = isOpen;
        this.favourites = favourites;
        this.name = name;
        this.phone = phone;
        this.recommends = recommends;
        this.userReview = userReview;
        this.previousWeekOpeningHours = previousWeekOpeningHours;
        this.pictureName = pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void covertBool() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDisplayPhoneNo() {
        return displayPhoneNo;
    }

    public String isDisplayPhoneNoString() {
        if (this.isDisplayPhoneNo())
            return "true";
        else
            return "false";
    }

    ;

    public void setDisplayPhoneNo(boolean displayPhoneNo) {
        this.displayPhoneNo = displayPhoneNo;
    }

    public void setDisplayPhoneNo(String displayPhoneNo) {
        if (displayPhoneNo.equalsIgnoreCase("true")) {
            this.displayPhoneNo = true;
        } else
            this.displayPhoneNo = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String isOpenString() {
        if (this.isOpen())
            return "true";
        else
            return "false";
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setOpen(String isOpen) {
        if (isOpen.equalsIgnoreCase("true")) {
            this.isOpen = true;
        } else
            this.isOpen = false;
    }

    public int getFavourites() {
        return favourites;
    }

    public void setFavourites(int favourites) {
        this.favourites = favourites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRecommends() {
        return recommends;
    }

    public void setRecommends(int recommends) {
        this.recommends = recommends;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }

    public String getPreviousWeekOpeningHours() {
        return previousWeekOpeningHours;
    }

    public void setPreviousWeekOpeningHours(String previousWeekOpeningHours) {
        this.previousWeekOpeningHours = previousWeekOpeningHours;
    }
}
